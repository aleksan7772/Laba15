package com.brain.lab.abstracts;

public class MultiCooker extends CooKer {
    @Override
    void cook() {
        System.out.println("Нажать кнопку готовить");
    }

    void switchProgram(int i) {
        System.out.println("Выбрать режим программы");
    }
}
