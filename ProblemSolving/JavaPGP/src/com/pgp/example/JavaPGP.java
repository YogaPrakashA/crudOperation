package com.pgp.example;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class JavaPGP {

	public static void main(String[] args) {
		String message = "Hello, PGP encryption!";

		try {
			encrypt(message);

		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static byte[] encrypt(String message) throws GeneralSecurityException {

		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(128); // The AES key size in number of bits
		SecretKey secKey = generator.generateKey();

		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		kpg.initialize(2048);
		KeyPair keyPair = kpg.generateKeyPair();

		PublicKey puKey = keyPair.getPublic();
		PrivateKey prKey = keyPair.getPrivate();

		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.PUBLIC_KEY, puKey);
		byte[] encryptedKey = cipher.doFinal(secKey.getEncoded());

		System.out.print(encryptedKey);

		decrypt(encryptedKey, prKey);

		return encryptedKey;
	}

	public static String decrypt(byte[] message, PrivateKey key) throws GeneralSecurityException {

		SecretKey originalKey = new SecretKeySpec(message, 0, message.length, "AES");
		Cipher aesCipher = Cipher.getInstance("AES");
		aesCipher.init(Cipher.DECRYPT_MODE, originalKey);
		byte[] bytePlainText = aesCipher.doFinal();// (byteCipherText);
		String plainText = new String(bytePlainText);

		return plainText;
	}

//	protected static PublicKey getPublicKey(byte[] encodedKey)
//			throws NoSuchAlgorithmException, InvalidKeySpecException {
//		KeyFactory factory = KeyFactory.getInstance("RSA");
//		X509EncodedKeySpec encodedKeySpec = new X509EncodedKeySpec(encodedKey);
//		return factory.generatePublic(encodedKeySpec);
//	}

//	protected static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
//		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
//		keyPairGenerator.initialize(1024, SecureRandom.getInstance("SHA1PRNG"));
//		return keyPairGenerator.generateKeyPair();
//	}

}
