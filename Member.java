
public class Member {
	private String Username,Password,Email,Contact;
	

	public Member() {
		super();
	}


	public Member(String username, String password, String email, String contact) {
		super();
		Username = username;
		Password = password;
		Email = email;
		Contact = contact;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		this.Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		this.Password = password;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		this.Email = email;
	}


	public String getContact() {
		return Contact;
	}


	public void setContact(String contact) {
		this.Contact = contact;
	}
	
	

}
