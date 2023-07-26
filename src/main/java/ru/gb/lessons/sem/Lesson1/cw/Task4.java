package ru.gb.lessons.sem.Lesson1.cw;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] nums = new int[n]; //todo : Возможно и так int[] nums = (1,2,3,4);
        System.out.println("Введите массив");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(isSymm(nums));


        for (int i = 0; i < n; i++) {
            System.out.printf("nums[%d] = %d \n", i, nums[i]);
        }
    }

    /**
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param nums Входной массив
     * @return Сообщение в виде string
     */
    private static String isSymm(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length-1-i]){
                return "Массив несимметричен!";
            }
        }
        return "Массив симметричен!";
       
    }
}
