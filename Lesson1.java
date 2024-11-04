import java.util.Random;
import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        lenInitialValueArray(6, 1);
    }

    public static void printThreeWords() {
        String firstWord = "Orange";
        String secondWord = "Banana";
        String thirdWord = "Apple";

        System.out.println(firstWord);
        System.out.print(secondWord);
        System.out.println();
        System.out.print(thirdWord);
    }

    public static void checkSumSing() {
        int a = 4;
        int b = -4;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {

            System.out.println("Желтый");

        } else
            System.out.println("Зеленый");

    }

    public static void compareNumbers1() {
        int a = 55;
        int b = 65;
        if (a > b) {
            System.out.println(a + " " + ">" + " " + b);
        } else if (a == b) {
            System.out.println(a + " " + "=" + " " + b);
        } else {
            System.out.println(a + " " + "<" + " " + b);
        }
    }

    public static void compareNumbers2() {
        int a = 55;
        int b = 65;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void compareSum() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = number.nextInt();
        System.out.println("Введите целое число b");
        int b = number.nextInt();

        boolean sum = a + b >= 10 && a + b <= 20;
        System.out.println(sum);
    }

    public static void numberIsPositiveOrNegative() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = number.nextInt();
        if (a >= 0) {
            System.out.println("Число" + " " + a + " " + "положительное");
        } else {
            System.out.println("Число" + " " + a + " " + "отрицательное");
        }
    }

    public static void numberIsNegative() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = number.nextInt();

        System.out.println(a < 0);

    }

    public static void printPhrase() {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите нужное количество");
        int count = number.nextInt();
        String phrase = "java";
        System.out.println(phrase.repeat(count));
    }

    public static boolean isYearLeap() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите год");
        int year = number.nextInt();

        boolean leapYear;
        leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapYear);
        return leapYear;
    }

    public static void replacementOfNumbers() {
        int[] arr = {0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i] - 1;
            }
            System.out.print(arr[i]);
        }
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            System.out.print(array[i] + "," + " ");
        }
    }

    public static void multiplyNumberInArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 6) {
                array[i] = array[i] * 2;
            } else {
                array[i] = array[i];
            }
            System.out.print(array[i] + "," + " ");
        }
    }

    public static void diagonalInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n, размер массива");
        int n = sc.nextInt();

        Random rand = new Random();

        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(8);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lenInitialValueArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }

}





