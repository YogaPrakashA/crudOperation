package com.demo.pgp.service;

import java.lang.reflect.Method;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.bouncycastle.openpgp.examples.KeyBasedFileProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class PGPCrypto implements CommandLineRunner {

	@Value("${output-file-path}")
	private Resource outputResource;

	@Value("${input-file-path}")
	private Resource inputResource;

	@Value("${public-key}")
	private Resource publicKeyResource;

	@Value("${private-key}")
	private Resource privateKResource;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String filePath = inputResource.getURI().getPath().toString(); // .getInputStream().toString();
		String publicKey = publicKeyResource.getURI().getPath().toString();
		String encryptedFilePath = outputResource.getInputStream().toString();

		boolean armor = true;
		boolean withIntegrityCheck = true;

		// KeyBasedFileProcessor keyBasedFileProcessor = new KeyBasedFileProcessor();

		Method methodName = KeyBasedFileProcessor.class.getDeclaredMethod("encryptFile",
				new Class[] { String.class, String.class, String.class, boolean.class, boolean.class });

		methodName.setAccessible(true);

		methodName.invoke(new KeyBasedFileProcessor(), encryptedFilePath, filePath, publicKey, armor,
				withIntegrityCheck);
//        
//	
//		
		// keyBasedFileProcessor.encryptFile(encryptedFilePath,filePath,publicKey,armor,withIntegrityCheck);

	}

}
