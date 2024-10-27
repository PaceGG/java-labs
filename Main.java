import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println();

        while (choice != 0){
            System.out.println("1. (1.5) Перезарядка пистолета");
            System.out.println("2. (1.7) Непустые имена");
            
            System.out.printf("Выберите задачу: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Pistol revolver = new Pistol(7);
                    revolver.load(3);
                    for (int i = 0; i < 5; i++) revolver.makeShoot();
                    revolver.load(8);
                    for (int i = 0; i < 2; i++) revolver.makeShoot();
                    revolver.unload();
                    revolver.makeShoot();
                    break;
                case 2:
                    Name surnameNameFatherName = new Name("Иванов", "Иван", "Иванович");
                    System.out.println("ФИО: " + surnameNameFatherName);

                    Name surnameName = new Name("Иванов", "Иван", null);
                    System.out.println("Фамилия Имя: " + surnameName);

                    Name name = new Name("", "Иван", "");
                    System.out.println("Имя: " + name);

                    Name emptyName = new Name(null, null, null);
                    System.out.println("Пустое имя: " + emptyName);
                    break;
                default:
                    break;
            }
        }
    }
    
}