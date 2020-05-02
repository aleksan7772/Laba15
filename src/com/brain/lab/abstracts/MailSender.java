package com.brain.lab.abstracts;

public interface MailSender {
    String createMail(String mail);

    void sendMail(String mail);

}
