package ru.butorin.main;
import ru.butorin.fraction.*;
import ru.butorin.animal.*;
import ru.butorin.lists.ListModifier;
import ru.butorin.university.Exam;
import ru.butorin.text.TextProcessing;
import ru.butorin.queue.QueueEquality;
import ru.butorin.geometry.*;
import ru.butorin.people.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Выберите задачу:");
            System.out.println("1. (1.1) Кэширование");
            System.out.println("2. (2.1) Декоратор");
            System.out.println("3. (3.4) Модифицация списка");
            System.out.println("4. (4.4) Чтение файла (студенты не сдавшие экзамен)");
            System.out.println("5. (5.4) Чтение файла (глухие согласные, каждое нечетное слово)");
            System.out.println("6. (6.4) Равенство участка очереди");
            System.out.println("7. (7.4) Ломаная из набора точек");
            System.out.println("8. (8.4) Стрим для набора учеников по номерам");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Fraction fraction1 = new Fraction(1, 2);
                    Fraction fraction2 = new Fraction(2, 4);
                    Fraction fraction3 = new Fraction(1, 2);

                    System.out.println("fraction1 = " + fraction1);
                    System.out.println("fraction2 = " + fraction2);
                    System.out.println("fraction3 = " + fraction3);

                    System.out.println();

                    System.out.println(fraction1 + " == " + fraction3 + ": " + fraction1.equals(fraction3));

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

                    System.out.println("// MeowingProcessor.processMeowing(catCounter, pumaCounter, catCounter)");
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
                    System.out.println("Вставка списка после элемента: " + element);
                    ListModifier.modifyList(list, element);
                    System.out.println("Модифицированный список: " + list);
                    System.out.println();

                    ArrayList<String> listStrings = new ArrayList<>();
                    listStrings.add("a");
                    listStrings.add("b");
                    listStrings.add("c");
                    listStrings.add("d");
                    listStrings.add("e");
                    listStrings.add("f");

                    String elementString = "c";

                    System.out.println("Исходный список: " + listStrings);
                    System.out.println("Вставка списка после элемента: " + elementString);
                    ListModifier.modifyList(listStrings, elementString);
                    System.out.println("Модифицированный список: " + listStrings);
                    break;
                }
                case 4: {
                    List<String> failureStudents = Exam.failureStudents();
                    System.out.println("Студенты не сдавшие экзамен: " + failureStudents);
                    break;
                }
                case 5: {
                    Set<Character> chars = TextProcessing.processText();
                    System.out.println(chars);
                    break;
                }
                case 6: {
                    ArrayDeque<String> queue = new ArrayDeque<>();
                    queue.add("a");
                    queue.add("b");

                    queue.add("c"); // 2
                    queue.add("c");
                    queue.add("c");
                    queue.add("c"); // 5

                    queue.add("g");

                    // ArrayDeque<Integer> queue = new ArrayDeque<>();
                    // queue.add(1);
                    // queue.add(2);

                    // queue.add(3); // 2
                    // queue.add(3);
                    // queue.add(3);
                    // queue.add(3); // 5

                    // queue.add(4);
                    // queue.add(5);

                    System.out.println("Исходная очередь: " + queue);
                    System.out.println("Введите начало и конец участка очереди: ");
                    int i = scanner.nextInt();
                    int j = scanner.nextInt();
                    System.out.println("Равенство очереди от " + i + " до " + j + ": " + QueueEquality.processQueue(queue, i, j));
                    System.out.println("Очередь после обработки: " + queue);
                    break;
                }
                case 7: {
                    Point p1 = new Point(1, 2);
                    Point p12 = new Point(1, 2);
                    Point p13 = new Point(1, -2);
                    Point p2 = new Point(3, 4);
                    Point p3 = new Point(5, 6);
                    Point p4 = new Point(1, 2);
                    Point p5 = new Point(3, -4);
                    Point p6 = new Point(4, -4);

                    List<Point> points = Arrays.asList(p1, p12, p13, p2, p3, p4, p5, p6);

                    System.out.println("Исходный список точек: " + points);

                    List<Point> processedPoints = points.stream()
                            .map(p -> new Point(p.getX(), Math.abs(p.getY())))
                            .distinct()
                            .sorted(Comparator.comparingInt(Point::getX))
                            .collect(Collectors.toList());
                    
                    Polyline polyline = new Polyline(processedPoints);
                    System.out.println(polyline);
                    break;
                }
                case 8: {
                    Path filename = Paths.get("ru/butorin/main/numbers.txt");

                    try {Map<Integer, List<String>> names = Files.lines(filename)
                            .map(line -> {
                                String[] parts = line.split(":");
                                String name = parts[0].trim();
                                String numberStr = parts.length > 1 ? parts[1].trim() : null;

                                String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

                                Integer number = numberStr != null && !numberStr.isEmpty() ? Integer.parseInt(numberStr) : null;

                                return new Person(formattedName, number);
                            })
                            .filter(person -> person.getNumber() != null)
                            .collect(Collectors.groupingBy(Person::getNumber, Collectors.mapping(Person::getName, Collectors.toList())));
                            System.out.println(names);
                    } catch (IOException e) {
                        System.out.println("Ошибка чтения файла: " + e.getMessage());
                        System.out.println("Текущая директория: " + System.getProperty("user.dir"));
                    }

                    break;
                }
            }
        }

    }
}