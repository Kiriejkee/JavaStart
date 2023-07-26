package ru.gb.lessons.sem.Lesson1.cw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("resStr = " + changeString(str));
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param str Исходная строка
     * @return результат
     */
    private static String changeString(String str) {
      return str.substring(str.length()/2)+  str.substring(0, str.length()/2);
    }
}
