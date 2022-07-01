package lesson10;

import java.util.Arrays;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21) - 10;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Min :" + countAmountOfMinNumbers(array));
        System.out.println("Max :" + countAmountOfMaxNumbers(array));

    }

    private static int countAmountOfMinNumbers(int[] array) {
        int counter = 0;
        int minNum = 10;
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minNum == array[i]) {
                counter++;
            }
        }
        return counter;
    }

    private static int countAmountOfMaxNumbers(int[] array) {
        int counter = 0;
        int maxNum = -10;
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxNum == array[i]) {
                counter++;
            }
        }
        return counter;
    }
}

