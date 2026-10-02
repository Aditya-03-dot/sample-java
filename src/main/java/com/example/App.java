package com.example;

public class App {

    // Hardcoded credential: SonarQube flags this as a vulnerability/security hotspot
    private static final String PASSWORD = "admin123";

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        int unused = 10; // code smell: unused variable
        return a / b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Sum = " + app.add(2, 3));
    }
}
