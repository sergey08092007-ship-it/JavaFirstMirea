package ru.mirea.task3.s1;

import java.util.Arrays;
import java.util.Random;

public class Classsu {
    public static void main(String[] args) {
        int size = 5;

        // === ПОДХОД 1: Использование Math.random() ===
        double[] arr1 = new double[size];
        for (int i = 0; i < size; i++) {
            // Math.random() дает число от 0.0 до 1.0. Умножаем на 100 для диапазона [0, 100)
            arr1[i] = Math.random() * 100;
        }
        System.out.println("До сортировки (Math.random): " + Arrays.toString(arr1));
        Arrays.sort(arr1); // Встроенная сортировка по возрастанию
        System.out.println("После сортировки (Math.random): " + Arrays.toString(arr1) + "\n");

        // === ПОДХОД 2: Использование класса java.util.Random ===
        Random rand = new Random();
        double[] arr2 = new double[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = rand.nextDouble() * 100;
        }
        System.out.println("До сортировки (Random): " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("После сортировки (Random): " + Arrays.toString(arr2));
    }
}