package com.nisren.fibonacci;

public class Main {
    /**
     * 0,1,1,2,3,5,8,13,21.......
     * 8=5+3
     * 13=8+5
     * f(n)=f(n-1)+f(n-2);
     * 1.Unintentional/Invalid input
     * 2.Base condition
     * 3.Recursion Case
     */
    public static void main(String[] args) {

        Main recursion = new Main();
        int printValue = recursion.fibonacci(4);
        System.out.println(printValue);
    }

    public int fibonacci(int number) {
        //Handle Invalid/Unintentional Input
        if (number < 0) {
            return -1;
        }
        //Base Case
        if (number == 0 || number == 1) {
            return number;
        }
        //Recursive Case
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

