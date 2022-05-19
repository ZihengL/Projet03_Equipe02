package tests;

import utilitaires.AES;

/*
 * Description: 
 *
 * Auteur: Zi heng Liu
 * Date: 16/05/2022
 * V 1.0 
 */
public class TestAES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String secretKey = "abcd";
		
		String originalString = "bomjour";
		String encryptedString = AES.encrypt(originalString, secretKey);		// Encryption
		String decryptedString = AES.decrypt(encryptedString, secretKey);		// Decryption
		
		System.out.println(originalString);		// ORIGINAL
		
		System.out.println(encryptedString);	// ENCRYPTED
		
		System.out.println(decryptedString);	// DECRYPTED
	}

}
