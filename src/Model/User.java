package Model;

public class User {
	int id;
	String userName;
	String password;
	int age;
	
	public User() {
		
	}
	public User(int id, String userName, String password, int age) {
		this.id=id;
		this.userName=userName;
		this.password= password;
		this.age=age;		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
