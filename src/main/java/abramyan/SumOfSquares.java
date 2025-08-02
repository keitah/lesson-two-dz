package abramyan;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N (> 0): "); // Ввод целого числа из консоли, которое больше null'я
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Ошибка: число должно быть больше 0.");
            return;
        }
        // dear Math
        int sum = 0;
        for (int i = N; i <= 2 * N; i++) {
            sum += i * i;
        }
        // выводим результат
        System.out.println("Сумма квадратов от N^2 до (2N)^2: " + sum);
    }
}
//for11