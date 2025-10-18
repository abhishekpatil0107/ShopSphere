package com.ecommerce.controller;

import com.ecommerce.dto.ApiResponse;
import com.ecommerce.dto.AuthRequest;
import com.ecommerce.dto.AuthResponse;
import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class AuthController {

  private final UserRepository userRepo;
  private final PasswordEncoder passwordEncoder;

  public AuthController(UserRepository userRepo, PasswordEncoder passwordEncoder) {
    this.userRepo = userRepo;
    this.passwordEncoder = passwordEncoder;
  }

  @PostMapping("/register")
  public ApiResponse<AuthResponse> register(@RequestBody AuthRequest req, HttpServletRequest request) {
    userRepo.findByEmail(req.getEmail()).ifPresent(u -> {
      throw new ResponseStatusException(HttpStatus.CONFLICT, "Email already registered");
    });

    User u = new User();
    u.setName(req.getName());  // ✅ set name
    u.setEmail(req.getEmail());
    u.setPassword(passwordEncoder.encode(req.getPassword()));
    u = userRepo.save(u);

    HttpSession session = request.getSession(true);
    session.setAttribute("userId", u.getId());

    AuthResponse ar = new AuthResponse(u.getId(), u.getName(), u.getEmail()); // ✅ name from DB
    return new ApiResponse<AuthResponse>(true, ar, "Registered");
  }

  @PostMapping("/login")
  public ApiResponse<AuthResponse> login(@RequestBody AuthRequest req, HttpServletRequest request) {
    User u = userRepo.findByEmail(req.getEmail())
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials"));

    if (!passwordEncoder.matches(req.getPassword(), u.getPassword())) {
      throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
    }

    HttpSession session = request.getSession(true);
    session.setAttribute("userId", u.getId());

    AuthResponse ar = new AuthResponse(u.getId(), u.getName(), u.getEmail()); // ✅ name
    return new ApiResponse<AuthResponse>(true, ar, "Logged in");
  }

  @PostMapping("/logout")
  public ApiResponse<Void> logout(HttpServletRequest request) {
    HttpSession s = request.getSession(false);
    if (s != null) s.invalidate();
    return new ApiResponse<Void>(true, null, "Logged out");
  }

  @GetMapping("/me")
  public ApiResponse<AuthResponse> me(HttpServletRequest request) {
    HttpSession s = request.getSession(false);
    if (s == null) throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Not logged in");
    Object uidObj = s.getAttribute("userId");
    if (uidObj == null) throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Not logged in");

    Long userId = (uidObj instanceof Long) ? (Long) uidObj : Long.valueOf(uidObj.toString());
    User u = userRepo.findById(userId)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "User not found"));

    AuthResponse ar = new AuthResponse(u.getId(), u.getName(), u.getEmail()); // ✅ return name
    return new ApiResponse<AuthResponse>(true, ar, "OK");
  }
}
