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
            System.out.println("4. (3.4) Автомат");
            System.out.println("5. (4.1) Пистолет (наследствие)");
            System.out.println("6. (5.8) Стрелок");
            
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
                    System.out.println("Автомат без параметров, с 10 патронами: ");
                    Rifle ak47 = new Rifle();
                    ak47.load(10);
                    System.out.println("1 выстрел");
                    ak47.shoot();

                    System.out.println("Автомат с лимитом магазина 25, с 20 патронами: ");
                    Rifle m4 = new Rifle(25);
                    m4.load(20);
                    System.out.println("1 выстрел");
                    m4.shoot();
                    
                    System.out.println("Автомат с лимитом магазина 10 и скорострельностью 2, с 5 патронами: ");
                    Rifle awp = new Rifle(10, 2);
                    awp.load(5);
                    System.out.println("Встрел 3 секунды");
                    awp.shootRange(3);


                    break;
                case 5:
                    // Pistol revolver = new Pistol(7);
                    // revolver.load(3);
                    // for (int i = 0; i < 5; i++) revolver.makeShoot();
                    // revolver.load(8);
                    // for (int i = 0; i < 2; i++) revolver.makeShoot();
                    // revolver.unload();
                    // revolver.makeShoot();

                    System.out.println("Создаем пистолет с лимитом магазина 7 и заряжаем 3 патрона");
                    Pistol2 revolver2 = new Pistol2(7);
                    revolver2.load(3);
                    System.out.println("Делаем 5 выстрелов");
                    for (int i = 0; i < 5; i++) revolver2.shoot();
                    System.out.println("Заряжаем 8 патронов");
                    revolver2.load(8);
                    System.out.println("Делаем 2 выстрела");
                    for (int i = 0; i < 2; i++) revolver2.shoot();
                    System.out.println("Разряжаем пистолет");
                    revolver2.unload();
                    System.out.println("Делаем 1 выстрел");
                    revolver2.shoot();
                    break;
                case 6:
                    System.out.println("Стрелок без оружия");
                    Shooter boxer = new Shooter("Боксер");
                    boxer.shoot();

                    System.out.println("Стрелок с пистолетом");
                    Shooter cowboy = new Shooter("Ковбой");
                    Pistol2 pistol = new Pistol2(7);
                    pistol.load(4);
                    cowboy.setWeapon(pistol);
                    cowboy.shoot();

                    System.out.println("Стрелок с автоматом, скорострельность 3, количество патрон 2");
                    Shooter swat = new Shooter("Спецназ");
                    Rifle rifle = new Rifle(30,3);
                    rifle.load(2);
                    swat.setWeapon(rifle);
                    swat.shoot();
                default:
                    break;
            }
        }
    }
    
}