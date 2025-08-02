package abramyan;

import java.util.Scanner;

public class CoordinateQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ввод координат
        System.out.print("Введите координату X (не равную 0): ");
        double x = scanner.nextDouble(); // вводим кX через сканнер в консоли

        System.out.print("Введите координату Y (не равную 0): ");
        double y = scanner.nextDouble(); // вводим кY через сканнер в консоли

        // проверка, что точка не лежит на осях
        if (x == 0 || y == 0) {
            System.out.println("Точка лежит на одной из координатных осей!");
        } else {
            int quadrant;

            if (x > 0 && y > 0) {
                quadrant = 1; // 1 четверть
            } else if (x < 0 && y > 0) {
                quadrant = 2; // 2 четверть
            } else if (x < 0 && y < 0) {
                quadrant = 3; // 3 четверть
            } else {
                quadrant = 4; // 4 четверть
            }
            // выводим результат
            System.out.println("Точка находится в " + quadrant + "-й координатной четверти.");
        }

        scanner.close();
    }
}
// If22*