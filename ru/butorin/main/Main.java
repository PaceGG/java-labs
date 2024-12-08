package ru.butorin.main;
import ru.butorin.fraction.*;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Выберите задачу:");
            System.out.println("1. (1.1) Кэширование");
            System.out.println("0. Выход");
            choice = new java.util.Scanner(System.in).nextInt();
            switch (choice) {
                case 1: {
                    Fraction fraction1 = new Fraction(1, 2);
                    Fraction fraction2 = new Fraction(2, 4);

                    System.out.println("fraction1 = " + fraction1);
                    System.out.println("fraction2 = " + fraction2);

                    System.out.println();

                    System.out.println(fraction1 + " == " + fraction2 + ": " + fraction1.equals(fraction2));
                    System.out.println(fraction1 + " = " + fraction1.getDoubleValue());
                    System.out.println(fraction2 + " = " + fraction2.getDoubleValue());
                    System.out.println();
                    System.out.println("fraction1.setDenominator(-3)");
                    System.out.println();
                    fraction1.setDenominator(-3);
                    System.out.println(fraction1 + " == " + fraction2 + ":" + fraction1.equals(fraction2));
                    System.out.println(fraction1 + " = " + fraction1.getDoubleValue());
                    System.out.println(fraction2 + " = " + fraction2.getDoubleValue());

                }
            }
        }

    }
}
