package com.giovaniwahl.SendGrid.services.exceptions;

public class EmailException extends RuntimeException{
    public EmailException(String msg) {
        super(msg);
    }
}
