package PracticeSelenium;

import java.util.Base64;

public class Encoding_a_password_in_Java {

public static void main (String[] arg) {
	
	// Raw password.
	String Password = "welcome";
	
	// Password Encrypted in Bytes.
	byte[] passinbyte= Password.getBytes();
	
	// Password encoded to Strings.
	String encodedpass= Base64.getEncoder().encodeToString(passinbyte);
	
	// Print encoded password.
	System.out.println(encodedpass);
	
	
}


}
