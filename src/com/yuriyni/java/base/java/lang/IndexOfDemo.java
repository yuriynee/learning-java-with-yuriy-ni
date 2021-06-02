package com.yuriyni.java.base.java.lang;

public class IndexOfDemo {
    public static void main(String[] args) {

        String myStr = "Hello World";

        int index1= myStr.indexOf('W');
        int index2 = myStr.indexOf('X');

        int index3 = myStr.indexOf('o'  );

        //starting the search at the specified index.
        int index4 = myStr.indexOf('o',5 );

        System.out.println(index1);
        System.out.println(index2);

        System.out.println(index3);
        System.out.println(index4);


        int index5 = myStr.indexOf("World"  );
        System.out.println(index5);
    }
}
