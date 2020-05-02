package com.brain.lab.abstracts;

public class Mobile extends Phone {
    private Integer simCount;
    private String display;

    public Integer getSimCount() {
        return simCount;
    }

    public void setSimCount(Integer simCount) {
        this.simCount = simCount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    void call() {
        System.out.println("Заходим в контакты и звоним");
    }

    @Override
    void powerOn() {
        System.out.println("Зажать кнопку питания");
        System.out.println("Телефон включается");
    }

    @Override
    void powerOff() {
        System.out.println("Зажать кнопку питания");
        System.out.println("Телефон выключается");
    }
}
