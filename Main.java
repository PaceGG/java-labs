import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1. (1.1) Обобщенная коробка");
            System.out.println("2. (1.3) Сравнимое");
            System.out.println("3. (2.2) Поиск максимума");
            System.out.println("4. (3) Обобщенные методы");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Box<Integer> intBox = new Box<>();
                    intBox.setItem(3);

                    BoxUtils.printBoxValue(intBox);
                    break;
                case 2:
                    Point p1 = new Point(1,0);
                    Point p2 = new Point(0,1);
                    Point p3 = new Point(1,1);
                    Point p4 = new Point(2,2);

                    System.out.println("p1 v p2: " + p1.compare(p2));
                    System.out.println("p1 v p3: " + p1.compare(p3));
                    System.out.println("p1 v p4: " + p1.compare(p4));
                    System.out.println("p2 v p3: " + p2.compare(p3));
                    System.out.println("p2 v p4: " + p2.compare(p4));
                    System.out.println("p3 v p4: " + p3.compare(p4));
                    break;
                case 3:
                    Box<Double> d1 = new Box<>();
                    d1.setItem(1.3);

                    Box<Double> d2 = new Box<>();
                    d2.setItem(5.4);

                    Box<Integer> i1 = new Box<>();
                    i1.setItem(3);

                    Box<Integer> i2 = new Box<>();
                    i2.setItem(8);

                    List<Box<? extends Number>> boxes = List.of(d1, d2, i1, i2);
                    System.out.println("Максимальное число: " + BoxUtils.findMaxDouble(boxes));
                    break;
                case 4:
                    List<String> strings = List.of("qwerty", "asdfg", "zx");
                    // List<String> strings = List.of();
                    List<Integer> lengths = ListTransformator.transform(strings, new TransformerLength());
                    List<String> filteredLengths = Filter.filter(strings, new SorterLength());
                    String combinedString = Reduction.reduce(strings, new ReduceString());
                    System.out.println("Исходные строки: " + strings);
                    System.out.println("Длины строк: " + lengths);
                    System.out.println("Строки больше 3 символов: " + filteredLengths);
                    System.out.println("Объединение строк: " + combinedString);
                    System.out.println();

                    List<Integer> ints = List.of(1,-3,7);
                    // List<Integer> ints = List.of();
                    List<Integer> abses = ListTransformator.transform(ints, new TransformerAbs());
                    List<Integer> filteredAbses = Filter.filter(ints, new SorterPositive());
                    Integer sum = Reduction.reduce(ints, new ReduceInteger());
                    System.out.println("Исходные числа: " + ints);
                    System.out.println("Абсолютные значения: " + abses);
                    System.out.println("Положительные значения: " + filteredAbses);
                    System.out.println("Сумма чисел: " + sum);
                    System.out.println();

                    ArrayList<Integer> numbers1 = new ArrayList<>();
                    numbers1.add(1);
                    numbers1.add(3);
                    numbers1.add(2);
                    ArrayList<Integer> numbers2 = new ArrayList<>();
                    numbers2.add(6);
                    numbers2.add(-4);
                    numbers2.add(5);
                    List<ArrayList<Integer>> numbers = List.of(numbers1, numbers2);
                    List<Integer> maxes = ListTransformator.transform(numbers, new TransformerMax());
                    List<ArrayList<Integer>> filteredMaxes = Filter.filter(numbers, new SorterOnlyPositive());
                    Integer len = Reduction.reduce(numbers, new ReduceArrayLength()).size();
                    System.out.println("Исходные списки: " + numbers);
                    System.out.println("Максимумы: " + maxes);
                    System.out.println("Положительные списки: " + filteredMaxes);
                    System.out.println("Длина списков: " + len);
                    System.out.println();
                    break;
            }
        }
    }
}