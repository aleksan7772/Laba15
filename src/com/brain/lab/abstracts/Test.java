package com.brain.lab.abstracts;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        MultiCooker multiCooker = new MultiCooker();
        System.out.println("Smartphone");
        smartPhone.setName("Samsung");
        smartPhone.setSerialNumber(651651110);
        smartPhone.setSimCount(2);
        smartPhone.setDisplay("Amoled");
        System.out.println(smartPhone.getName());
        System.out.print("Серийный номер: " + smartPhone.getSerialNumber());
        System.out.println();
        System.out.println("Количество симкарт: " + smartPhone.getSimCount());
        System.out.println("Дисплей: " + smartPhone.getDisplay());
        smartPhone.powerOn();
        smartPhone.call();
        smartPhone.runApp();
        smartPhone.powerOff();

        DialPhone dialPhone = new DialPhone();
        dialPhone.setHasAnswerphone(true);
        System.out.println();
        System.out.println("DialPhone");
        dialPhone.setName("Phillips");
        dialPhone.powerOn();
        dialPhone.autoAnswer();
        dialPhone.powerOff();


        System.out.println();
        System.out.println("MultiCooker");
        multiCooker.powerOn();
        multiCooker.switchProgram(1);
        multiCooker.cook();

        System.out.println();
        System.out.println("Oven");
        Oven oven = new Oven();
        oven.powerOn();
        oven.cook();
        oven.initTimer(30);
        System.out.println();
        varargs(smartPhone,dialPhone,oven,multiCooker);
    }

    public static void varargs(AbstractDevice... abstractDevices) {
        for (AbstractDevice device : abstractDevices) {
        device.powerOff();
        }
    }

}
