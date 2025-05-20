package com.demo.pgp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pgp.service.PgpEncryptAndDecryptService;

@RestController
@RequestMapping("/crypto")
public class PgpEncryptAndDecryptController {

	@Autowired
	PgpEncryptAndDecryptService pgpEncryptAndDecryptService;

	@PostMapping("/encrypt")
	public void encrypt(@RequestParam String message ) {
		
//		byte[] convertToByte= message.getBytes();
//		try {
//			//pgpEncryptAndDecryptService.encrypt(convertToByte);
//		} catch (GeneralSecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@PostMapping("/decrypt")
	public void decrypt() {

	}
}
