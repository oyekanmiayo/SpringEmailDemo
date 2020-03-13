package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * @author: Ayomide Oyekanmi aoyekanmi@teamapt.com, ayomideoyekanmi@gmail.com
 * @date: 2019-11-05
 */
@RestController
public class EmailController {

    @Autowired
    SmtpEmailSender sender;

    @RequestMapping("/send-mail")
    public void sendMail() throws MessagingException {
        sender.send("ayomideoyekanmi@gmail.com", "Test Email from Spring", "<h1>Hello</h1>");
    }
}
