package com.nisren.fibinacci;

public class Main {
    /**
     * 0,1,1,2,3,5,8,13,21.......
     * 8=5+3
     * 13=8+5
     * f(n)=f(n-1)+f(n-2);
     * 1.Unintentional/out of syllabus
     * 2.Base condition
     * 3.Recursion Case
     */
    public static void main(String[] args) {

        Main recursion = new Main();
        var printValue = recursion.fibonacci(8);
        //int printValue = recursion.fibonacci(5);
        System.out.println(printValue);

    }

    public int fibonacci(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);

    }
}

