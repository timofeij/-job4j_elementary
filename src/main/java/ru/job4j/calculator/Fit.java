package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 " + womanWeight((short) 187));
    }
}
