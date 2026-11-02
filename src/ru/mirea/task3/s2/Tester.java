package ru.mirea.task3.s2;

import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle c) {
        if (count < circles.length) circles[count++] = c;
    }

    public Circle getSmallest() {
        if (count == 0) return null;
        Circle min = circles[0];
        for (int i = 1; i < count; i++)
            if (circles[i].getRadius() < min.getRadius()) min = circles[i];
        return min;
    }

    public Circle getLargest() {
        if (count == 0) return null;
        Circle max = circles[0];
        for (int i = 1; i < count; i++)
            if (circles[i].getRadius() > max.getRadius()) max = circles[i];
        return max;
    }

    // Сортировка по возрастанию радиуса (пузырьковая)
    public void sortByRadius() {
        for (int i = 0; i < count - 1; i++)
            for (int j = 0; j < count - i - 1; j++)
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle tmp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = tmp;
                }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) System.out.println(circles[i]);
    }

    public static void main(String[] args) {
        Tester tester = new Tester(10);
        Random rand = new Random();
        String[] colors = {"Красный", "Синий", "Зелёный", "Жёлтый", "Белый"};

        // Генерируем 5 случайных окружностей
        for (int i = 0; i < 5; i++) {
            double x = rand.nextDouble() * 20;
            double y = rand.nextDouble() * 20;
            double r = 1 + rand.nextDouble() * 10; // [1; 11)
            String color = colors[rand.nextInt(colors.length)];
            tester.addCircle(new Circle(new Point(x, y), r, color));
        }

        System.out.println("=== Все окружности ===");
        tester.displayAll();
        System.out.println("\nСамая маленькая: " + tester.getSmallest());
        System.out.println("Самая большая: " + tester.getLargest());

        tester.sortByRadius();
        System.out.println("\n=== После сортировки ===");
        tester.displayAll();
    }
}
