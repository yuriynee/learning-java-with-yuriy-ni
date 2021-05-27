package com.yuriyni.java.base.java.lang;

public class SubstringDemo {
    public static void main(String[] args) {

        String str = "Hello World";


        System.out.println("["+str.substring(6,11)+"]");
        System.out.println("["+str.substring(str.indexOf('W'),str.length())+"]");
    }
}
