package com.yuriyni.java.base.java.lang;

public class ReplaceAllDemo {
    public static void main(String[] args) {

        String str1 = "aabbaaac";
        String str2 = "Hello557World223";

        // regex for sequence of digits
        String regex = "\\d+";

        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str1.replaceAll("aa", "vv")); // zzbbzzac

        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " ")); // Learn Java @
    }
}
