package com.ksb.emailApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ksb.emailApi.model.EmailRequest;
import com.ksb.emailApi.services.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	//send email
	@RequestMapping(value="/sendEmail", method=RequestMethod.POST)
	public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request){

		System.out.println(request);
		boolean result = this.emailService.sendEmail(request.getSubject(), request.getMessage(), request.getTo(), request.getFrom());
		if(result) {
			return ResponseEntity.ok("successful");
		}else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("email not sent..");
		}
	}

}
