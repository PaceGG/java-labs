package ru.butorin.main;
import ru.butorin.fraction.*;
import ru.butorin.animal.*;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Выберите задачу:");
            System.out.println("1. (1.1) Кэширование");
            System.out.println("2. (2.1) Декоратор");
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
                    break;
                }
                case 2: {
                    Cat cat = new Cat("cat");
                    Puma puma = new Puma("puma");

                    MeowingCounter catCounter = new MeowingCounter(cat);
                    MeowingCounter pumaCounter = new MeowingCounter(puma);

                    MeowingProcessor.processMeowing(catCounter, pumaCounter, catCounter);

                    System.out.println("Количество мяуканий кота: " + catCounter.getCount());
                    System.out.println("Количество мяуканий пумы: " + pumaCounter.getCount());
                    break;
                }
            }
        }

    }
}
