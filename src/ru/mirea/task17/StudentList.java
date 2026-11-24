package ru.mirea.task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Общий интерфейс для всех трёх списков.
// Благодаря ему Tester работает с любым списком одинаково.
public interface StudentList {

    void add(Student student);        // b. добавить элемент
    boolean remove(int number);       // c. удалить элемент по номеру (с 1)
    Student get(int number);          // получить элемент по номеру (с 1)
    void printAll();                  // вывести весь список
    void clear();                     // e. очистить список
    boolean isEmpty();                // f. проверка на пустоту
    int size();                       // количество элементов

    // d. вывести один элемент (узел) списка на экран
    default void printElement(int number) {
        Student s = get(number);
        if (s == null) {
            System.out.println("Нет элемента с номером " + number);
        } else {
            System.out.print(number + ". ");
            s.print();
        }
    }

    // g. записать список в файл (каждый студент - отдельная строка)
    default void saveToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (int i = 1; i <= size(); i++) {
            writer.write(get(i).toFileLine() + "\n");
        }
        writer.close();
    }

    // h. прочитать список из файла (старое содержимое удаляется)
    default void loadFromFile(String fileName) throws IOException {
        clear();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                add(Student.fromFileLine(line));
            }
        }
        reader.close();
    }
}

