package com.hello.sb11task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Sb11TaskApplicationTests {

	@Autowired
	JavaMailSenderImpl javaMailSender;

	@Test
	void contextLoads() {
		//发送简单邮件
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setSubject("你好鸭丶");
		simpleMailMessage.setText("sdfsdfsdfsdfsdfsdfsdfsdf");

		simpleMailMessage.setFrom("810808038@qq.com");
		simpleMailMessage.setTo("1714616511@qq.com");
		javaMailSender.send(simpleMailMessage);
	}

	@Test
	void contextLoads2() throws MessagingException {
		//发送复杂邮件
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
		mimeMessageHelper.setSubject("你好鸭……");
		mimeMessageHelper.setText("<p style='color:red'>谢谢你的鸭</p>",true);
		mimeMessageHelper.addAttachment("1.jpg",new File("C:\\Users\\asus\\Desktop\\1.jpg"));
		mimeMessageHelper.addAttachment("2.jpg",new File("C:\\Users\\asus\\Desktop\\2.jpg"));

		mimeMessageHelper.setFrom("810808038@qq.com");
		mimeMessageHelper.setTo("1714616511@qq.com");
		javaMailSender.send(mimeMessage);
	}

}
