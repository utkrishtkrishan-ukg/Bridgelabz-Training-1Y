package com.gla.workshop;

public class lambdafunction {

    public void HelloPrint(){
        System.out.println("Hello");
    }

//    () -> {
//        System.out.println("Hello");         // also a lambda function
//    }

//    num -> {
//        if (num%2==0)
//            return true;
//        else
//            return false;
//    }

    public int StringLength(String str){
        return str.length();
    }

//    (String str) ->{
//        return str.length();         // lambda function
//    }

//    str -> str.length();           // also a lambda function

    public void add(int a , int b){
        System.out.println(a+b);
    }

//    (a,b) -> system.out.println(a+b);        // also a lambda function

    static void main(String[] args) {

    }
}
