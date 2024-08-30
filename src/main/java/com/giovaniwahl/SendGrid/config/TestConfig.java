package com.giovaniwahl.SendGrid.config;

import com.giovaniwahl.SendGrid.services.EmailService;
import com.giovaniwahl.SendGrid.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
