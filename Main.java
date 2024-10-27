import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println();
        
        while (choice != 0){
            System.out.println("Выберите задачу:");
            System.out.println("1. (1.3) Имена");
            System.out.println("2. (1.2) Человек");
            System.out.println("3. (2.4 + 3.4) Сотрудники и отделы");
            System.out.println("4. (4.5) Имена но в другом порядке");
            System.out.println("5. (5.1) Пистолет стреляет");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Name cleopatra = new Name("Клеопатра");
                    Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
                    Name mayakovsky = new Name("Маяковский", "Владимир");

                    System.out.println("Name cleopatra = new Name(\"Клеопатра\"): " + cleopatra);
                    System.out.println("Name pushkin = new Name(\"Пушкин\", \"Александр\", \"Сергеевич\"): " + pushkin);
                    System.out.println("Name mayakovsky = new Name(\"Маяковский\", \"Владимир\"): " + mayakovsky);
                    break;
                case 2:
                    Person cleopatra2 = new Person("Клеопатра", 152);
                    Person pushkin2 = new Person("Пушкин", 167);
                    Person vladimir = new Person("Владимир", 189);

                    System.out.println("Person cleopatra2 = new Person(\"Клеопатра\", 152): " + cleopatra2);
                    System.out.println("Person pushkin2 = new Person(\"Пушкин\", 167): " + pushkin2);
                    System.out.println("Person vladimir = new Person(\"Владимир\", 189): " + vladimir);
                    break;
                case 3:
                    Departament it = new Departament("IT");
                    Employee kozlov = new Employee("Козлов", it);
                    Employee petrov = new Employee("Петров", it);
                    Employee sidorov = new Employee("Сидоров", it);
                    it.setDirector(kozlov);

                    System.out.println(kozlov);
                    System.out.println(petrov);
                    System.out.println(sidorov);

                    ArrayList<Employee> staff = kozlov.getDepartament().getStaff();
                    System.out.println("Список сотрудников отдела в котором работает " + kozlov.getName() + ": ");
                    for (Employee employee: staff){
                        System.out.println(employee.getName());
                    }
                    break;
                case 4:
                    Name2 cleopatra4 = new Name2("Клеопатра");
                    Name2 pushkin4 = new Name2("Пушкин", "Александр", "Сергеевич");
                    Name2 mayakovsky4 = new Name2("Маяковский", "Владимир");
                    Name2 bonifantevich4 = new Name2("Бонифатьевич", "Христофор");

                    System.out.println("Name2 cleopatra4 = new Name2(\"Клеопатра\"): " + cleopatra4);
                    System.out.println("Name2 pushkin4 = new Name2(\"Пушкин\", \"Александр\", \"Сергеевич\"): " + pushkin4);
                    System.out.println("Name2 mayakovsky4 = new Name2(\"Маяковский\", \"Владимир\"): " + mayakovsky4);
                    System.out.println("Name2 bonifantevich4 = new Name2(\"Бонифатьевич\", \"Христофор\"): " + bonifantevich4);
                    break;
                case 5:
                    Pistol marston = new Pistol(3);
                    for (int i = 5; i > 0; i--){
                        marston.makeShoot();
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
