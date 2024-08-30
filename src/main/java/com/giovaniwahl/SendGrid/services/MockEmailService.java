package com.giovaniwahl.SendGrid.services;

import com.giovaniwahl.SendGrid.dto.EmailDto;
import com.giovaniwahl.SendGrid.services.exceptions.EmailException;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class MockEmailService implements EmailService{

    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    public void sendEmail(EmailDto dto){
        LOG.info("Sending email to:{}", dto.getTo());
        LOG.info("Email Sent!");
    }
}
