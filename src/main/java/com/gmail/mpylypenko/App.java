package com.gmail.mpylypenko;

import com.gmail.mpylypenko.calculator.Calculator;
import com.gmail.mpylypenko.calculator.Operation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator calculator = new Calculator();
        double result = calculator.calculate(87.8, 3, Operation.PLUS);
        System.out.println("87.8 + 3 = " + result);
    }
}
