EmailsendingSB

dependencies
============

Java Mail sender 

	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-mail</artifactId>
	</dependency>


application.properties 
=========================
server.port=8087

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=XXXX@gmail.com
spring.mail.password=XXXX YYYY AAAA BBBB
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true


username is gmail id
password is to be create for app password

Goto gmail , manage accounts,  2 step verification yes, app password generate
> app name give spring boot application name
> it generates, which we have to mention in application.properties file 

If app password not seen, see below link 

create app passwords problems: 
==============================
https://support.google.com/mail/thread/4477145/no-app-passwords-under-security-signing-in-to-google-panel?hl=en

code:
=====
EmailSenderService
EmailSenderService
