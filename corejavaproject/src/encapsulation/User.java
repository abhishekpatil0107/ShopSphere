package encapsulation;

public class User {
	private int uid;
	private String fname;
	private String email;
	private String password;
	
	
	public User() {
	}

	public User(int uid, String fname, String email, String password) {
		this.uid = uid;
		this.fname = fname;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", email=" + email + ", password=" + password +  "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
}
