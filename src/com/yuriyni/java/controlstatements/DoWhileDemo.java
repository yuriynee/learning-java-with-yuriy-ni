package com.yuriyni.java.controlstatements;

public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 8;

        do {
            //However, the body of do...while loop is executed once before the test expression is checked.
            System.out.println("not checked:" + count);
            count++;
        }while (count <= 7);
    }
}
