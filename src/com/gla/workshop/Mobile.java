package com.gla.workshop;

public class Mobile {
    String Model = "Vivo v50e";
    String OS = "Origin";
    int Battery = 6000;
    String Processor = "mediatek";

    public static void main(String[] args) {
        Mobile m = new Mobile();
        System.out.println(m.Model);
        System.out.println(m.OS);
        System.out.println(m.Battery);
        System.out.println(m.Processor);
    }
}