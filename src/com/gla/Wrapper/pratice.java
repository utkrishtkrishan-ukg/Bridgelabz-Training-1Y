package com.gla.Wrapper;

public class pratice {
    static void main(String[] args) {

        int x = 10;
        Integer y = new Integer(23);  //boxing
        Integer w = Integer.valueOf(52);  // boxing

        Integer z = 20;  //auto boxing

        int m = z.intValue();  //unboxing
        int n = z;  //auto unboxing

        System.out.println(y);
        System.out.println(w);
        System.out.println(z);
        System.out.println(m);
        System.out.println(n);

        Integer a=200;
        Integer b=200;
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
