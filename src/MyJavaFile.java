package com.java;

import com.kotlin.MyKotlinFileKt;

public class MyJavaFile {
    public static void main(String args[]){
        int sum= MyKotlinFileKt.add(23,43);
        System.out.println("Printing sum of nos:"+sum);

    }

    public static Object getArea(int l, int b) {
        return l*b;



    }
}
