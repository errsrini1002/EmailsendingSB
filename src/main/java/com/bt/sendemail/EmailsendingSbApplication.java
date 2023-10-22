package com.bt.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailsendingSbApplication {

	@Autowired
	private EmailSenderService senderService ; 
	
	public static void main(String[] args) {
		SpringApplication.run(EmailsendingSbApplication.class, args);
	}

	
	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {
		senderService.sendEmail("errsrini1003@gmail.com", 
				"Test email", "This is body of the email service");
	}
}
