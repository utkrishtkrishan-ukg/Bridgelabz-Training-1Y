package com.gla.workshop;

public class functionalinterface2 {
    static void main(String[] args) {
        Runnable obj = () -> {
            for (int i=0;i<15;i++){
                System.out.print(i+" ");
            }
        };

        Thread t = new Thread(obj);
        t.start();
    }
}
