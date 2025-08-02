package abramyan;

import java.util.Scanner;

public class FinderTheSmallestIntegerK { // Поиск наименьшего целого unit K (unit, здесь число, использовал в коммах чтобы не запутаться)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N (> 1): "); // вводим целое unit N
        int N = scanner.nextInt();

        while (N <= 1) { // N, введённый в консоль должен быть больше 1, чтобы не было ошибки
            System.out.print("Число должно быть больше 1. Повторите ввод: "); // указал unit меньше целого 1 - получили ошибку
            N = scanner.nextInt(); // возвращаем сканер на ввод целого unit и заново считываем
        }
        // затем с помощью цикла while подбирается наименьшее K, при котором 3 * K > N.
        int K = 1;
        while (3 * K <= N) {
            K++;
        }
        // выводим результат в консоль
        System.out.println("Наименьшее целое K, при котором 3*K > N: " + K);
    }
}
//while9