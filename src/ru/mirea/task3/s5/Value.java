package ru.mirea.task3.s5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Value {
    // Курсы валют (условные)
    private static final double USD_TO_RUB = 92.50;
    private static final double EUR_TO_RUB = 100.30;
    private static final double CNY_TO_RUB = 12.70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в рублях: ");
        double rubles = scanner.nextDouble();

        NumberFormat rubFormat = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat eurFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("\nКонвертация");
        System.out.printf("Рубли:   %s%n", rubFormat.format(rubles));
        System.out.printf("Доллары: %s%n", usdFormat.format(rubles / USD_TO_RUB));
        System.out.printf("Евро:    %s%n", eurFormat.format(rubles / EUR_TO_RUB));
        System.out.printf("Юани:    %.2f ¥%n", rubles / CNY_TO_RUB);
    }
}
