package ru.mirea.task4.d3;

public class Test {
    public static void main(String[] args) {
        Sezon favorite = Sezon.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        Sezon.printFavorite(favorite);

        System.out.println("\n=== Все времена года ===");
        for (Sezon s : Sezon.values()) {
            System.out.printf("%-8s | t° = %3d°C | %s%n",
                    s, s.getAverageTemperature(), s.getDescription());
        }
    }
}