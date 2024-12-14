package ru.job4j.calculator;

public class MathFunction {

    public static double func1(float m, float v) {
        double e = (m * (v * v)) / 2;
        return e;
    }

    public static void main(String[] args) {
        System.out.println("Кинетическая энергия = " + func1(1, 2) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(9, 7) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(15, 3) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(17, 1) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(39, 6) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(73, 8) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(46, 9) + " Дж");
        System.out.println("Кинетическая энергия = " + func1(8, 15) + " Дж");

        Calculator.plus(10, 20);
    }
}