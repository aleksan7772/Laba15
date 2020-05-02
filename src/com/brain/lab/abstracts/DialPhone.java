package com.brain.lab.abstracts;

public class DialPhone extends Phone {
    private Boolean hasAnswerphone;

    public Boolean getHasAnswerphone() {
        return hasAnswerphone;
    }

    public void setHasAnswerphone(Boolean hasAnswerphone) {
        this.hasAnswerphone = hasAnswerphone;
    }

    @Override
    void call() {
        System.out.println("Звонить");
    }

    @Override
    void powerOn() {
        System.out.println("Для включения подключить к сети");

    }

    @Override
    void powerOff() {
        System.out.println("Для отключения отключить от сети");

    }

    void autoAnswer() {
        System.out.println("Автоответчик записывает");
    }
}
