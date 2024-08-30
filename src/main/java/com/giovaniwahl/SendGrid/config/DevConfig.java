package com.giovaniwahl.SendGrid.config;

import com.giovaniwahl.SendGrid.services.EmailService;
import com.giovaniwahl.SendGrid.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Bean
    public EmailService emailService(){
        return new SendGridEmailService();
    }
}
