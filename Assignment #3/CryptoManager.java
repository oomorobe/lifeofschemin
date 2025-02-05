
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	// Name: Okeoghene Excel Omorobe
	// Description: Determine if a string is within the allowable bounds of ASCII codes 
	public static boolean stringInBounds (String plainText) {
		
		//Variables
		boolean isValid = true;
		
		for (int i = 0; i < plainText.length(); i++) {
			
			char c = plainText.charAt(i);
			
			if (c < LOWER_BOUND || c > UPPER_BOUND) {
				
				isValid = false;
			}
			
		}
		
		//Return true if the characters are within the allowable bound
		return isValid;
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	
	//Name: Okeoghene Excel Omorobe
	//Description: Encrypt a given string using the Ceasar Cipher 
	public static String encryptCaesar(String plainText, int key) {
		
		if (!stringInBounds(plainText)) {
			return "";
		}
		
		String encrypted = "";
		
		for (int i = 0; i < plainText.length(); i++) {
			
			char c = plainText.charAt(i);
			int ec = (int)c + key;
			
			while (ec > UPPER_BOUND) {
				
				ec -= RANGE;
			}
			
			encrypted  += (char) ec;
		}
		//Return
		return encrypted;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	//Name: Okeogehene Excel Omorobe
	//Description: Encrypt a string using Bellaso Cipher
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		String encrypted = "";
		int bl = bellasoStr.length();
		int ub = (int) UPPER_BOUND;
		
		for (int i = 0; i < plainText.length(); i++) {
			
			char c = plainText.charAt(i);
			int ec = (int)c + (int)bellasoStr.charAt(i % bl);
			
			while (ec> ub) {
				
				ec -= RANGE;
			}
			
			encrypted += (char) ec;
			
		}
		//Return
		return encrypted;
		
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	//Name: Okeogehene Excel Omorobe
	//Description: Decrypt a given string that was encrypted before, with Caesar Cipher
	public static String decryptCaesar(String encryptedText, int key) {
		
		String decrypted = ""; 
		
		for (int i = 0; i < encryptedText.length(); i++) {
			
			char c = encryptedText.charAt(i);
			int dc = (int)c - key;
			
			while (dc < LOWER_BOUND) {
				
				dc += RANGE; 
			}
			
			decrypted += (char) dc;
		}
		//Return
		return decrypted;

	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	//Name: Okeogehene Excel Omorobe
   //Description: Decrypt a given string that was 
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		
		String decrypted = "";
		int bl = bellasoStr.length();
		int lb = (int) LOWER_BOUND;
		
		for (int i = 0; i < encryptedText.length(); i++) {
			
			char c = encryptedText.charAt(i);
			int dc = (int)c - (int)bellasoStr.charAt(i % bl);
			
			while (dc < lb) {
				
				dc += RANGE;
			}
			
			decrypted += (char) dc;
		}
		//Return
		return decrypted;
		
	}
}
