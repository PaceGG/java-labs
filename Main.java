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
            System.out.println("3. (2.3) Телефонный справочник");
            System.out.println("4. (3.4) Бинарное дерево");
            
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
                case 3:
                    PhoneBook phoneBook = new PhoneBook();

                    // contacts
                    phoneBook.addContact("123", "Ваня");
                    phoneBook.addContact("121", "Вася");
                    phoneBook.addContact("456", "Петя");
                    phoneBook.addContact("789", "Коля");
                    phoneBook.addContact("321", "Саша");

                    System.out.println("Телефонный справочник: ");
                    System.out.println(phoneBook);

                    // delete contact
                    System.out.println("Удаление контакта \"Саша\"");
                    phoneBook.removeContact("Саша");

                    System.out.println("Телефонный справочник с удаленным контактом: ");
                    System.out.println(phoneBook);

                    // get contact
                    System.out.println("Телефон Вани: " + phoneBook.getPhone("Ваня"));
                    
                    // check
                    System.out.println("Проверка наличия телефона 123: " + phoneBook.hasPhone("123")); // true
                    System.out.println("Проверка наличия телефона 111: " + phoneBook.hasPhone("111")); // false
                    System.out.println("Проверка наличия имени Ваня: " + phoneBook.hasName("Ваня")); // true
                    System.out.println("Проверка наличия имени Макс: " + phoneBook.hasName("Макс")); // false

                    // book size
                    System.out.println("Количество контактов: " + phoneBook.getSize());

                    // massives
                    String[] names = phoneBook.getNames();
                    System.out.println("Массив имен:");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println(names[i]);
                    }
                    
                    String[] phoneNumbers = phoneBook.getPhoneNumbers();
                    System.out.println("Массив номеров:");
                    for (int i = 0; i < phoneNumbers.length; i++) {
                        System.out.println(phoneNumbers[i]);
                    }
                    
                    String[] contacts = phoneBook.getContacts();
                    System.out.println("Массив контактов (номер - имя):");
                    for (int i = 0; i < contacts.length; i++) {
                        System.out.println(contacts[i]);
                    }

                    // search
                    String[] searchResults = phoneBook.search("В");
                    System.out.println("\"В\" Результаты поиска: ");
                    for (int i = 0; i < searchResults.length; i++) {
                        System.out.println(searchResults[i]);
                    }
                    break;
                case 4:
                    Node tree = new Node();

                    tree.add(3);
                    tree.add(5);
                    tree.add(4);
                    tree.add(7);
                    tree.add(1);
                    tree.add(2);

                    System.out.println(tree);
                    break;
                default:
                    break;
            }
        }
    }
    
}