package com.codegym;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProXy proXy = new MathCalculatorProXy();
        double result = proXy.div(1, 0);

        System.out.println("1 / 2 = " + result);
        result = proXy.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.MAX_VALUE = " + result);
    }
}
