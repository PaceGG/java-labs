package ru.butorin.main;
import ru.butorin.fraction.*;
import ru.butorin.animal.*;
import ru.butorin.lists.ListModifier;
import ru.butorin.university.Exam;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Выберите задачу:");
            System.out.println("1. (1.1) Кэширование");
            System.out.println("2. (2.1) Декоратор");
            System.out.println("3. (3.4) Модифицация списка");
            System.out.println("4. (4.4) Чтение файла (студенты не сдавшие экзамен)");
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
                case 3: {
                    List<Integer> list = new ArrayList<>();
                    list.add(1);
                    list.add(2);
                    list.add(3);
                    list.add(4);
                    list.add(5);
                    list.add(6);

                    int element = 3;

                    System.out.println("Исходный список: " + list);
                    ListModifier.modifyList(list, element);
                    System.out.println("Модифицированный список: " + list);
                    System.out.println();

                    List<String> listStrings = new ArrayList<>();
                    listStrings.add("a");
                    listStrings.add("b");
                    listStrings.add("c");
                    listStrings.add("d");
                    listStrings.add("e");
                    listStrings.add("f");

                    String elementString = "c";

                    System.out.println("Исходный список: " + listStrings);
                    ListModifier.modifyList(listStrings, elementString);
                    System.out.println("Модифицированный список: " + listStrings);
                    break;
                }
                case 4: {
                    Exam.failureStudents();
                    break;
                }
            }
        }

    }
}
