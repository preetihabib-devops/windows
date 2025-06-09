package com.example;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Addition: " + app.add(5, 3));
        System.out.println("Subtraction: " + app.subtract(10, 4));
        System.out.println("Multiplication: " + app.multiply(7, 2));
        System.out.println("Division: " + app.divide(10.0, 2.0));
        
        try {
            System.out.println("Division by zero: " + app.divide(10.0, 0.0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}