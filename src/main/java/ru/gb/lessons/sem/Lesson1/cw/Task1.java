package ru.gb.lessons.sem.Lesson1.cw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // todo : Заметки сделать
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        System.out.println("res = " + zadanieOneMethod(n));
    }

    /**
     * @apiNote
     * @param n входящее число
     * @return произведение разрядов минус сумма разрядов
     */

    private static int zadanieOneMethod(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        int res = pr - sum;
        return res;
    }

}
