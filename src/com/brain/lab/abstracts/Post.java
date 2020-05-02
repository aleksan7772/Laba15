package com.brain.lab.abstracts;

public class Post implements MailSender {
    private int index;

    @Override
    public String createMail(String mail) {
        return "Создаем сообщение" + mail;
    }

    public Post(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отсылаем сообщение"+ mail);
    }
}
