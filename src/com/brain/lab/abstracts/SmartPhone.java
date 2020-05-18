package com.brain.lab.abstracts;

public class SmartPhone extends Mobile implements Caller, EmailSender {
    private String os;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    void runApp() {
        System.out.println("Зайти в меню и запустить приложение");
    }

    @Override
    public String createMail(String mail) {
        return "Создаем сообщение" + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отсылаем сообщение"+ mail);
    }

    @Override
    public void call() {
        System.out.println("Набираем номер и звоним");
    }

    @Override
    public String editMail(String mail) {
        return "Редактируем сообщение " + mail;
    }
}
