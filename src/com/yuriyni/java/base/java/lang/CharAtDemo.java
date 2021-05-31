package com.yuriyni.java.base.java.lang;

public class CharAtDemo {
    public static void main(String[] args) {

        String myStr = "Hello World";
        char h0 = myStr.charAt(0);
        char e1 = myStr.charAt(1);
        char l2 = myStr.charAt(2);
        char l3 = myStr.charAt(3);
        char o4 = myStr.charAt(4);
        char space5 = myStr.charAt(5);
        char w6 = myStr.charAt(6);
        char o7 = myStr.charAt(7);
        char r8 = myStr.charAt(8);
        char l9 = myStr.charAt(9);
        char d10 = myStr.charAt(10);

        // charAt method throws IndexOutOfBoundsException - if the index argument is negative or not less than the length of this string.
//        char whatWillBePrinted11 = myStr.charAt(11);

        System.out.print(h0);
        System.out.print(e1);
        System.out.print(l2);
        System.out.print(l3);
        System.out.print(o4);
        System.out.print(space5);
        System.out.print(w6);
        System.out.print(o7);
        System.out.print(r8);
        System.out.print(l9);
        System.out.print(d10);
        //System.out.print(whatWillBePrinted11);
    }
}
