package com.brain.lab.abstracts;

abstract public class CooKer extends AbstractDevice {
    @Override
    void powerOn() {
        System.out.println("Нажать на кнопку питания");
    }

    @Override
    void powerOff() {
        System.out.println("Нажать на кнопку питания");
    }

    abstract void cook();
}
