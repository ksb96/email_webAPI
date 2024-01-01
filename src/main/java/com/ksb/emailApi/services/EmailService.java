//package com.ksb.emailApi.services;
//
//import java.net.Authenticator;
//import java.util.Properties;
//
//import org.apache.logging.log4j.message.Message;
//import org.springframework.boot.rsocket.server.RSocketServer.Transport;
//import org.springframework.stereotype.Service;
//
//import jakarta.mail.PasswordAuthentication;
//import jakarta.mail.Session;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//
//@Service
//public class EmailService<Transport> {
//	// this is responsible to send email..
//	public boolean sendEmail(String message, String subject, String to, String from) {
//
//		//const
////		String from = "royritesh102@gmail.com";
//		
//		Boolean status = false;
//		// Variable for gmail
//		String host = "smtp.gmail.com";
//
//		// SMTP properties
//		Properties properties = System.getProperties();
//		System.out.println("PROPERTIES " + properties);
//
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.starttls.enable",true);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//		
//		String username ="royritesh102";
//		String password="fopd oeht wylb jcfv";
//		
////		Session.getInstance(properties, new Authenticator() {
////			@Override
////			protected java.net.PasswordAuthentication getPasswordAuthentication(){
////				return super.getPasswordAuthentication(user,password);
////			}
////		});
//		
//		// Step 1: to get the session object..
//        Session session = Session.getInstance(properties);
//        Authenticator authenticator = new Authenticator() {
//        	@Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        };
//        
//        try {
//    		MimeMessage m = new MimeMessage(session);
//			// from email
//			m.setFrom(new InternetAddress(from));
//			// adding recipient to message
//			m.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(to));
//			// adding subject to message
//			m.setSubject(subject);
//			// adding text to message
//			m.setText(message);
//
//			//send
//			Transport.send(m);
//			status=true;
//			System.out.println("Sent success...................");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        
////		session.setDebug(true);
////
//		return status;
//
//	}
////		}
//}
//
////}
