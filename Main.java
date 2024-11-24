import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1. (1.1) Обобщенная коробка");
            System.out.println("2. (1.3) Сравнимое");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Box<Integer> intBox = new Box<>();
                    intBox.setItem(3);

                    main.printBoxValue(intBox);
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
            }
        }
    }

    public void printBoxValue(Box<Integer> box) {
        if (!box.isEmpty()) {
            Integer value = box.getItem();
            System.out.println("Значение в коробке: " + value);
        } else {
            System.out.println("Коробка не содержит объект.");
        }
    }
}