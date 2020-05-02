package com.brain.lab.abstracts;

public class Oven extends CooKer {

    @Override
    void cook() {
        System.out.println("Поместить протвень в духовку");
    }

    void initTimer(int i1) {
        System.out.println("Выставить таймер");
    }
}
