package Model;

public class EncryptedPassword {
	String encryptedPassword;
	
	public  EncryptedPassword(String encryptedPassword) {
		
		this.encryptedPassword=encryptedPassword;
		
	}
	
	public  EncryptedPassword() {	

	}
	
	
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	


}
