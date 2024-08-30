package com.giovaniwahl.SendGrid.services;

import com.giovaniwahl.SendGrid.dto.EmailDto;

public interface EmailService {
    void sendEmail(EmailDto dto);
}
