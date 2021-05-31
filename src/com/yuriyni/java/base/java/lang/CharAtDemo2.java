package com.yuriyni.java.base.java.lang;

public class CharAtDemo2 {
    public static void main(String[] args) {

        String myStr = "I Love Java";

        //Returns the index within this string of the first occurrence of the specified character.
        int index = myStr.indexOf("J");

        //Returns the char value at the specified index.
        char myChar = myStr.charAt(index);

        System.out.print(myChar);
    }
}
