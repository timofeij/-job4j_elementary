package ru.job4j.calculator;

public class Calculator {

    public static void tim(float katet1, float katet2) {
        float two = 2;

        System.out.println((katet1 * katet2) / two);
    }

    public static void main(String[] args) {
        Calculator.tim(3, 5);
    }
}
