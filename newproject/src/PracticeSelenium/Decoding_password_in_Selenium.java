package PracticeSelenium;

import java.util.Base64;

public class Decoding_password_in_Selenium {
	
	public static void main (String[] args) {
		
		// Encrypted password:		
		String encryptedpass = "d2VsY29tZQ==";
		
		// Encrypted password converted to Byte
		byte[] decodedpassinbytes = Base64.getDecoder().decode(encryptedpass);
		
		// String object created to decode the password in Strings
		String decodedpass = new String(decodedpassinbytes);
		
		// Print decoded password
		System.out.println(decodedpass);
	}

}
