package ru.skypro;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        // write your code here
        //Задание №1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
        }
        System.out.println("Cумма трат за месяц составила " + sum + " рублей.");

        //Задание №2
        int min = arr [0];
        int max = arr [0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат составила " + max + " рублей.");

        //Задание №3
        float averageValue = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

        //Задание №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}



