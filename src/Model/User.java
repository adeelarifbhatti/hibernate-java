package Model;

public class User {
	int id;
	String userName;
	String password;
	
	private EncryptedPassword ePassword= new EncryptedPassword();
	
	public User() {		
	}
	
	public User(int id, String userName, String password) {
		this.id=id;
		this.userName=userName;
		this.password= password;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EncryptedPassword getePassword() {
		return ePassword;
	}

	public void setePassword(EncryptedPassword ePassword) {
		this.ePassword = ePassword;
	}

}
