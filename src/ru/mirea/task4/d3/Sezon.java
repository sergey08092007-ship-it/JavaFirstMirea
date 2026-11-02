package ru.mirea.task4.d3;

public enum Sezon {
    WINTER(-10) {
        @Override
        public String getDescription() { return "Холодное время года"; }
    },
    SPRING(10) {
        @Override
        public String getDescription() { return "Холодное время года"; }
    },
    SUMMER(25) {
        @Override
        public String getDescription() { return "Теплое время года"; } // Переопределение!
    },
    AUTUMN(5) {
        @Override
        public String getDescription() { return "Холодное время года"; }
    };

    private final int averageTemperature;

    // Конструктор enum — всегда private
    Sezon(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() { return averageTemperature; }

    // Абстрактный метод — каждая константа ОБЯЗАНА его реализовать
    public abstract String getDescription();

    // Метод с switch
    public static void printFavorite(Sezon season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }
}