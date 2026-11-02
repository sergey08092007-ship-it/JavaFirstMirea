package ru.mirea.task3.s3;

import java.util.Random;

public class Incre {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + rand.nextInt(90); // [10; 99]
            System.out.print(arr[i] + " ");
        }

        // Проверяем строгое возрастание: каждый следующий > предыдущего
        boolean isIncreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println("\nСтрого возрастающая: " + isIncreasing);
    }
}
