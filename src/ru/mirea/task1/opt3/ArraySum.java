package ru.mirea.lab1;

import java.util.Scanner;

public class ArraySum {
    /*3
    public static void main(String[] args) {
            // 1. Создание и инициализация массива "как в Си"
            int[] numbers = {4, 8, 15, 16, 23, 42};

            int sum = 0;

            // 2. Подсчет суммы элементов с помощью цикла for
            // Сумма "вводится" (накапливается) в переменную sum
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // 3. Вычисление среднего арифметического
            // Мы приводим sum к типу double, чтобы избежать потери дробной части
            // при целочисленном делении в Java
            double average = (double) sum / numbers.length;

            // 4. Вывод результата на экран
            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Среднее арифметическое: " + average);
        }
     */

    /*4 public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Ввод размера массива с проверкой на корректность
            int n;
            do {
                System.out.print("Введите размер массива (целое число больше 0): ");
                n = scanner.nextInt();
            } while (n <= 0); // Цикл повторится, если пользователь введет 0 или отрицательное число

            // Создание массива
            int[] array = new int[n];

            // 2. Ввод элементов массива с клавиатуры
            System.out.println("Введите " + n + " целых чисел:");
            for (int i = 0; i < n; i++) {
                System.out.print("Элемент [" + i + "]: ");
                array[i] = scanner.nextInt();
            }

            // 3. Подсчет суммы с помощью цикла do-while
            int sumDoWhile = 0;
            int i = 0;
            do {
                sumDoWhile += array[i];
                i++;
            } while (i < n);

            // 4. Подсчет суммы с помощью цикла while
            int sumWhile = 0;
            int j = 0;
            while (j < n) {
                sumWhile += array[j];
                j++;
            }

            // 5. Поиск минимального и максимального элементов
            int min = array[0];
            int max = array[0];

            for (int k = 1; k < n; k++) {
                if (array[k] < min) {
                    min = array[k];
                }
                if (array[k] > max) {
                    max = array[k];
                }
            }

            // 6. Вывод результатов на экран
            System.out.println("\n--- Результаты ---");
            System.out.println("Сумма элементов (вычислена через do-while): " + sumDoWhile);
            System.out.println("Сумма элементов (вычислена через while):    " + sumWhile);
            System.out.println("Минимальный элемент массива: " + min);
            System.out.println("Максимальный элемент массива: " + max);

            scanner.close();
        }
    }

     */

    /*6   public static void main(String[] args) {

            // Заголовок таблицы
            System.out.println("Первые 10 членов гармонического ряда:");
            System.out.println("-------------------------------------------");
            System.out.printf("%-5s %-15s %-15s%n", "n", "Член (1/n)", "Сумма H(n)");
            System.out.println("-------------------------------------------");

            double sum = 0.0;

            // Вычисление и вывод первых 10 членов
            for (int n = 1; n <= 10; n++) {
                double term = 1.0 / n;   // n-й член ряда
                sum += term;             // нарастающая частичная сумма

                // Форматированный вывод:
                //   %-5d    — номер, целое число, ширина 5, выравнивание по левому краю
                //   %-15.6f — вещественное число, 6 знаков после запятой, ширина 15
                //   %n      — перенос строки (платформонезависимый)
                System.out.printf("%-5d %-15.6f %-15.6f%n", n, term, sum);
            }

            System.out.println("-------------------------------------------");
        }

     */