package com.medical.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.medical.model.Doctor;
 

 
@Service("mailService")
public class MailServiceImpl {
 
    @Autowired
    JavaMailSender getMailSender;
 
    public void sendEmail(Doctor mail)  {
        SimpleMailMessage mimeMessage = new SimpleMailMessage();
 
        try {
 
            // MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
 
            mimeMessage.setSubject(mail.getMail_subject());
            mimeMessage.setFrom("karthik987753@gmail.com");
            mimeMessage.setTo(mail.getMailed());
            mimeMessage.setText(mail.getMail_content());
            
            getMailSender.send(mimeMessage);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}