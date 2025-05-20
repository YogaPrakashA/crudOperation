package com.demo.pgp;

import java.lang.reflect.Method;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.bouncycastle.openpgp.examples.KeyBasedFileProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PgpApplication implements CommandLineRunner {

//	@Value("${output-file-path}")
//	private String outputResource;
//
//	@Value("${input-file-path}")
//	private String inputResource;
//
//	@Value("${public-key}")
//	private String publicKeyResource;
//
//	@Value("${private-key}")
//	private String privateKResource;

	public static void main(String[] args) {
		SpringApplication.run(PgpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\aspra\\OneDrive\\Desktop\\PGP File.txt"; // .getInputStream().toString();
		String publicKey = "C:\\Users\\aspra\\PGP Keys\\Yoga_public.asc";
		String encryptedFilePath = "C:\\Users\\aspra\\Output\\output.pgp";

		boolean armor = true; 
		boolean withIntegrityCheck = true;

		// KeyBasedFileProcessor keyBasedFileProcessor = new KeyBasedFileProcessor();

		Method methodName = KeyBasedFileProcessor.class.getDeclaredMethod("encryptFile",
				new Class[] { String.class, String.class, String.class, boolean.class, boolean.class });

		methodName.setAccessible(true);

		methodName.invoke(new KeyBasedFileProcessor(), encryptedFilePath, filePath, publicKey, armor,
				withIntegrityCheck);
//        

	}
}
