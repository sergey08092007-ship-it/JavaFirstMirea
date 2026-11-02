package ru.mirea.task3.s4;

import java.util.Random;
import java.util.Scanner;

public class Arry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Валидация ввода: n должно быть натуральным (> 0)
        do {
            System.out.print("Введите размер массива (натуральное число > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next(); // съедаем некорректный ввод
            }
            n = scanner.nextInt();
        } while (n <= 0);

        Random rand = new Random();
        int[] arr = new int[n];

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1); // [0; n]
            System.out.print(arr[i] + " ");
        }

        // Подсчёт чётных
        int evenCount = 0;
        for (int num : arr)
            if (num % 2 == 0) evenCount++;

        if (evenCount == 0) {
            System.out.println("\nЧётных чисел нет.");
            return;
        }

        // Формируем массив чётных
        int[] evenArr = new int[evenCount];
        int idx = 0;
        for (int num : arr)
            if (num % 2 == 0) evenArr[idx++] = num;

        System.out.print("\nМассив чётных: ");
        for (int num : evenArr) System.out.print(num + " ");
        System.out.println();
    }
}