// src/api/client.js

// Base URL comes from environment variable
const API_BASE = import.meta.env.VITE_API_BASE || "http://localhost:8080";

export async function api(path, opts = {}) {
  const res = await fetch(`${API_BASE}${path}`, {
    credentials: "include", // keep if backend uses cookies/session
    headers: {
      "Content-Type": "application/json",
      ...(opts.headers || {}),
    },
    ...opts,
  });

  const text = await res.text();
  let json = null;

  try {
    json = JSON.parse(text);
  } catch {
    json = text;
  }

  if (!res.ok) throw new Error((json && json.message) || res.statusText);

  return json;
}
