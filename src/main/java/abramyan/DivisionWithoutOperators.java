package abramyan;

import java.util.Scanner;

public class DivisionWithoutOperators { // звучит как название джанк-группы / нью-панкрок группы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // вводим N и K в консоли
        System.out.print("Введите целое положительное число N: "); // например 17
        int N = scanner.nextInt();

        System.out.print("Введите целое положительное число K: "); // например 5
        int K = scanner.nextInt();

        // проверка на корректность
        if (N <= 0 || K <= 0) {
            System.out.println("Оба числа должны быть положительными.");
            return;
        }

        int quotient = 0;
        int remainder = N;

        // пока остаток больше или равен K, вычитаем K и увеличиваем частное
        while (remainder >= K) {
            remainder = remainder - K;
            quotient = quotient + 1;
        }

        // вывод результатов
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток: " + remainder);
    }
}
//while3