package ru.gb.lessons.sem.Lesson1.cw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();
        System.out.println("k = " + changePlus(scanner, n));
        scanner.close();
    }


    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых
     *         следует отрицательное число.
     * @param scanner вспомогательный параметр
     * @param n  количество чисел в последовательности
     * @return результат
     */
    private static int changePlus(Scanner scanner, int n) {
        int k = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n -1; i++) {
            int b = scanner.nextInt();
            if (a>=0 && b<0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}
