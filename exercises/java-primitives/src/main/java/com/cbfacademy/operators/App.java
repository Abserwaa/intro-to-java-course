package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        operand1 = 10.20;
        operand2 = 12.10;
        double operandtotal = operand1 + operand2;
        System.out.println(operand1 + operand2);

         return(operandtotal);
        
        
    }

    public static double subtract(double operand1, double operand2) {
        operand1 = 10.20;
        operand2 = 12.10;
        double operand3 = operand1 - operand2;
        System.out.println(operand1 - operand2);

        return(operand3);
    }

    public static double multiply(double operand1, double operand2) {
        operand1 = 10.20;
        operand2 = 12.10;
        double operand4 = operand1 * operand2;
        System.out.println(operand1 * operand2);
         return(operand4);
    }

    public static Boolean areEqual(double operand1, double operand2) {
        operand1 = 10.20;
        operand2 = 12.10;
        boolean operand5 = operand1 == operand2;
        System.out.println(operand2==operand2);
        return(operand5);
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        operand1 = 10.20;
        operand2 = 12.10;
        boolean operand6 = operand1<operand2;
        System.out.println(operand2<operand2);
        return(operand6);

    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        operand1 = 10.20;
        operand2 = 12.10;
        boolean operand7= operand1>operand2;
        System.out.println(operand2>operand2);
        return(operand7);

    }
}
