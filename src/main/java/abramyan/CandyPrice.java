package abramyan;

import java.util.Scanner;

public class CandyPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену за 1 кг конфет: "); // вводим в консоли цену за конфеты
        double pricePerKg = scanner.nextDouble();

        for (int i = 1; i <= 10; i++) {
            double weight = i * 0.1; // рассчитываем цену за 1кг, с шагом 100 грамм (0,1 кг)
            double cost = weight * pricePerKg; // уважаемая математика присутствует
            System.out.printf("%.1f кг = %.2f\n", weight, cost); // \n для красивого переноса строки результата с шагом 0,1кг
        }

        scanner.close();
    }
}
//for5