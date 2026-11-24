package ru.mirea.task9; //Comparable (реализация)

public class student implements Comparable<student> {
    private int iDNumber;        // номер студенческого билета
    private String firstName;
    private String lastName;
    private double gpa;          // средний балл

    public student(int iDNumber, String firstName, String lastName, double gpa) {
        this.iDNumber = iDNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }           //cоздаёт  заполненный объект (данные о студенте)

    public int getIDNumber() { return iDNumber; }
    public void setIDNumber(int iDNumber) { this.iDNumber = iDNumber; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // отрицательное - этот студент раньше, положительное - позже, 0 - равны
    @Override
    public int compareTo(student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return iDNumber + " | " + lastName + " " + firstName + " | " + gpa;
    }
}
