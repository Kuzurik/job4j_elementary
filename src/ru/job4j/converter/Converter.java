package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 90;
    }

    public static int rubleToDollar(int value) {
        return value / 74;
    }

    public static void main(String[] args) {
        int out = Converter.rubleToEuro(180);
        boolean passed = out == 2;
        System.out.println("180 rubles are 2 euro. Test result : " + passed);

        int result = Converter.rubleToDollar(148);
        boolean passed1 = result == 2;
        System.out.println("148 rubles are 2 dollars. Test result : " + passed1);
    }
}
