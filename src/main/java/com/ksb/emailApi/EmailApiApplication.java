package com.ksb.emailApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.ksb.emailApi.services.EmailSenderService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class EmailApiApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailApiApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() throws MessagingException {
		senderService.sendEmail("kb08june@gmail.com", "This is a subject", "This is a body");
	}
}