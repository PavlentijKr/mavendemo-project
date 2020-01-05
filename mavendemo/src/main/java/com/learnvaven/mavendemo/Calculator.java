package com.learnvaven.mavendemo;

public class Calculator {
    public int summ(int a, int b){
        return  a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        if (b == 0)
            return  -1;
        return  a/b;
    }

}
