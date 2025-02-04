package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        boolean result = number < 0;
        if (result) {
            System.out.println("This is negative number");
        } else {
            System.out.println("это число не отрицательное");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.checkNumber(4);
        AlertDivByZero.checkNumber(-10);
    }
}