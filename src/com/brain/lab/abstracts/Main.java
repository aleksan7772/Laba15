package com.brain.lab.abstracts;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Mobile mobile = new Mobile();
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
        smartPhone.setOs("Android");
        System.out.println("Операционная система: " + smartPhone.getOs());
        smartPhone.call();
        System.out.println(smartPhone.createMail(" Mail"));
        System.out.println(smartPhone.editMail(" Mail"));
        smartPhone.sendMail(" Mail");
        System.out.println();
        Post post = new Post(59);
        System.out.println("Номер отделения " + post.getIndex());
        System.out.println();
        varargs2(smartPhone,post);

    }

    public static void varargs2(MailSender... mailSenders) {
        for (MailSender sender : mailSenders) {
            sender.sendMail(" MailVar");
        }
    }
}
