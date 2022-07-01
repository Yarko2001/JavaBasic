package lesson10;

import java.util.Scanner;

public class TaskTwoVersionSecond {
    public static void main(String[] args) {
        String[] stringArray = {"anger", "awe", "joy", "grief", "love"};
        System.out.println("Enter some symbols :");
        Scanner scanner = new Scanner(System.in);
        String scannerString = scanner.nextLine();

        byte[] scannerBytes = scannerString.getBytes();
        int wordsCounter = 0;

        for (int i = 0; i < stringArray.length; i++) {
            byte[] wordBytes = stringArray[i].getBytes();
            int letterCounter = 0;
            for (int j = 0; j < wordBytes.length; j++) {
                for (int k = 0; k < scannerBytes.length; k++) {
                    if (wordBytes[j] == scannerBytes[k]) {
                        letterCounter++;
                        break;
                    }
                }
                if (stringArray[i].length() == letterCounter) {
                    wordsCounter++;
                }
            }
        }
        System.out.println(wordsCounter);
        scanner.close();
    }
}
