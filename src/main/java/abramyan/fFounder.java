package abramyan;

import java.util.Scanner;

public class fFounder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // вводим значение x
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // вычисление значения функции f(x)
        double f;
        if (x > 0) {
            f = 2 * Math.sin(x);
        } else {
            f = 6 - x;
        }

        // вывод результата
        System.out.println("Значение функции f(x): " + f);

        scanner.close();
    }
}
//if24