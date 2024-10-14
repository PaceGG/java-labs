import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
    
        while (choice != 0) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1. Найти сумму последних двух цифр числа");
            System.out.println("2. Проверить, является ли число положительным");
            System.out.println("3. Проверить, является ли символ заглавной буквой");
            System.out.println("4. Проверить, является ли a делителем b");
            System.out.println("5. Сумма последних цифр двух чисел");
            System.out.println("6. Безопасное деление");
            System.out.println("7. Сделать решение между двумя числами");
            System.out.println("8. Проверить, являются ли три числа в сумме одним из них");
            System.out.println("9. Определить возраст на основе числа");
            System.out.println("10. Напечатать дни недели по заданной строке");
            System.out.println("11. Развернуть список чисел");
            System.out.println("12. Возвести число в степень");
            System.out.println("13. Проверить, все ли цифры числа равны");
            System.out.println("14. Напечатать левый треугольник");
            System.out.println("15. Игра в угадай число");
            System.out.println("17. Найти последний индекс числа в массиве");
            System.out.println("18. Добавить элемент в массив");
            System.out.println("19. Развернуть массив");
            System.out.println("20. Конкатенировать два массива");
            System.out.println("21. Удалить отрицательные числа из массива");
            System.out.println("0. Выйти");
    
            choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.print("Введите число: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Сумма последних двух цифр: " + m.sumLastNums(num1));
                    break;
                case 2:
                    System.out.print("Введите число: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Число положительное? " + m.isPositive(num2));
                    break;
                case 3:
                    System.out.print("Введите символ: ");
                    char ch = scanner.next().charAt(0);
                    System.out.println("Символ заглавный? " + m.isUpperCase(ch));
                    break;
                case 4:
                    System.out.print("Введите два числа (a и b): ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a + " делится на " + b + " или " + b + " делится на " + a + "? " + m.isDivisor(a, b));
                    break;
                case 5:
                    int sum5 = 0;
                    System.out.print("Введите пять чисел: ");
                    for (int i = 0; i < 5; i++) {
                        int n = scanner.nextInt();
                        int prevSum = sum5;
                        sum5 = m.lastNumSum(sum5, n);
                        if (i != 0) System.out.println(prevSum + "+" + n + " это " + sum5);
                    }
                    System.out.println("Итого " + sum5);
                    break;
                case 6:
                    System.out.print("Введите числитель и знаменатель: ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println("Результат безопасного деления: " + m.safeDiv(x, y));
                    break;
                case 7:
                    System.out.print("Введите два числа (x и y): ");
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    System.out.println(m.makeDecision(x1, y1));
                    break;
                case 8:
                    System.out.print("Введите три числа (x, y и z): ");
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    int z = scanner.nextInt();
                    System.out.println("Сумма равна одному из чисел? " + m.sum3(x2, y2, z));
                    break;
                case 9:
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    System.out.println(m.age(age));
                    break;
                case 10:
                    System.out.print("Введите день недели: ");
                    String day = scanner.next();
                    m.printDays(day);
                    break;
                case 11:
                    System.out.print("Введите число: ");
                    int numToReverse = scanner.nextInt();
                    System.out.println("Разворот чисел: " + m.reverseListNums(numToReverse));
                    break;
                case 12:
                    System.out.print("Введите число и степень: ");
                    int base = scanner.nextInt();
                    int exponent = scanner.nextInt();
                    System.out.println("Результат: " + m.pow(base, exponent));
                    break;
                case 13:
                    System.out.print("Введите число: ");
                    int numToCheck = scanner.nextInt();
                    System.out.println("Все цифры равны? " + m.equalNum(numToCheck));
                    break;
                case 14:
                    System.out.print("Введите высоту треугольника: ");
                    int triangleHeight = scanner.nextInt();
                    m.leftTriangle(triangleHeight);
                    break;
                case 15:
                    m.guessGame();
                    break;
                case 16:
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    int[] array = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }
                    m.printArray(array);
                    break;
                case 17:
                    System.out.print("Введите размер массива: ");
                    int arrSize = scanner.nextInt();
                    int[] arrToFind = new int[arrSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrSize; i++) {
                        arrToFind[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска: ");
                    int numToFind = scanner.nextInt();
                    System.out.println("Последний индекс: " + m.findLast(arrToFind, numToFind));
                    break;
                case 18:
                    System.out.print("Введите размер массива: ");
                    int arrAddSize = scanner.nextInt();
                    int[] arrToAdd = new int[arrAddSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrAddSize; i++) {
                        arrToAdd[i] = scanner.nextInt();
                    }
                    System.out.print("Введите элемент для добавления: ");
                    int elementToAdd = scanner.nextInt();
                    System.out.print("Введите позицию для добавления: ");
                    int pos = scanner.nextInt();
                    arrToAdd = m.add(arrToAdd, elementToAdd, pos);
                    m.printArray(arrToAdd);
                    break;
                case 19:
                    System.out.print("Введите размер массива: ");
                    int arrRevSize = scanner.nextInt();
                    int[] arrToRev = new int[arrRevSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrRevSize; i++) {
                        arrToRev[i] = scanner.nextInt();
                    }
                    m.reverse(arrToRev);
                    System.out.println("Развернутый массив:");
                    m.printArray(arrToRev);
                    break;
                case 20:
                    System.out.print("Введите размер первого массива: ");
                    int size1 = scanner.nextInt();
                    int[] arr1 = new int[size1];
                    System.out.println("Введите элементы первого массива:");
                    for (int i = 0; i < size1; i++) {
                        arr1[i] = scanner.nextInt();
                    }
                    System.out.print("Введите размер второго массива: ");
                    int size2 = scanner.nextInt();
                    int[] arr2 = new int[size2];
                    System.out.println("Введите элементы второго массива:");
                    for (int i = 0; i < size2; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    int[] concatenatedArray = m.concat(arr1, arr2);
                    System.out.println("Конкатенированный массив:");
                    m.printArray(concatenatedArray);
                    break;
                case 21:
                    System.out.print("Введите размер массива: ");
                    int arrNegSize = scanner.nextInt();
                    int[] arrToDeleteNeg = new int[arrNegSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrNegSize; i++) {
                        arrToDeleteNeg[i] = scanner.nextInt();
                    }
                    int[] nonNegativeArray = m.deleteNegative(arrToDeleteNeg);
                    System.out.println("Массив без отрицательных чисел:");
                    m.printArray(nonNegativeArray);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    
        scanner.close();
    }
    
    

    // task 1
    // 2
    public int sumLastNums(int x){
        return (x%10)+(x/10%10);
    }

    // 4
    public boolean isPositive(int x){
        return x > 0;
    }

    // 6
    public boolean isUpperCase(char x){
        return Character.isUpperCase(x);
    }

    // 8
    public boolean isDivisor(int a, int b){
        if (a == 0 || b == 0) return false;
        return a % b == 0 || b % a == 0;
    }

    // 10
    public int lastNumSum(int a, int b){
        return a%10 + b%10;
    }

    // task 2
    // 2
    public double safeDiv(int x, int y){
        if (y == 0) return 0;
        return x / y;
    }

    // 4
    public String makeDecision(int x, int y){
        if (x > y) return x + " > " + y;
        else if (x < y) return x + " < " + y;
        else return x + " == " + y;
    }

    // 6
    public boolean sum3(int x, int y, int z){
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    // 8
    public String age(int x){
        if (x % 10 == 1 && x != 11) return x + " год";
        if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 || x != 13 || x != 14)) return x + " года";
        return x + " лет";
    }

    // 10
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }
    

    // task 3
    // 2
    public String reverseListNums(int x){
        String res = "";
        for (int i = x; i > 0; i--) {
            res += i + " ";
        }
        return res + "0";
    }

    // 4
    public int pow(int x, int y){
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    // 6
    public boolean equalNum(int x){
        while (x > 9){
            if (x % 10 != x / 10 % 10) return false;
            x /= 10;
        }
        return true;
    }

    // 8
    public void leftTriangle(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 10
    public void guessGame(){
        Scanner in = new Scanner(System.in);
        int answer = (int) (Math.random() * 10);
        System.out.println("Введите число от 0 до 9:");
        int x = in.nextInt();
        int attempts = 1;

        while (x != answer) {
            System.out.println("Вы не угадали, введите число от 0 до 9:");
            x = in.nextInt();
            attempts++;
        }
        System.out.println("Вы угадали число за " + attempts + " попыток");

        in.close();
    }

    // task 4
    // print array
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 2
    public int findLast(int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 4
    public int[] add(int[] arr, int x, int pos){
        int [] newArr = arr.clone();
        newArr[pos] = x;
        return newArr;
    }

    // 6
    public void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // 8
    public int[] concat(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        return arr;
    }

    // 10
    public int[] deleteNegative(int[] arr){
        int newLength = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0) newLength++;
        }

        int[] res = new int[newLength];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0) res[j++] = arr[i];
        }

        return res;
    }
}
