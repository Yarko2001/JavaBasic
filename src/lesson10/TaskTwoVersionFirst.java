package lesson10;

import java.util.Scanner;

public class TaskTwoVersionFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] StringArray = new String[]{"anger", "awe", "joy", "love", "grief"};
        System.out.println("Enter any symbols :");
        String enteredString = scanner.nextLine();
        char[] ch = new char[enteredString.length()];

        for (int i = 0; i < enteredString.length(); i++) {
            ch[i] = enteredString.charAt(i);
        }
        charCheck(ch);
        scanner.close();
    }

    private static void charCheck(char[] letters) {
        int a = 0, n = 0, g = 0, e = 0, r = 0, w = 0, j = 0, o = 0, y = 0, l = 0, v = 0, i = 0, f = 0;
        int counter = 0;
        for (int k = 0; k < letters.length; k++) {
            switch (letters[k]) {
                case 'a':
                    a++;
                    break;
                case 'n':
                    n++;
                    break;
                case 'g':
                    g++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'r':
                    r++;
                    break;
                case 'w':
                    w++;
                    break;
                case 'j':
                    j++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'y':
                    y++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'v':
                    v++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'f':
                    f++;
                    break;
                default:
            }
        }
        if (a >= 1 && n >= 1 && g >= 1 && e >= 1 && r >= 1) {
            System.out.println("anger");
            counter++;
        }
        if (a >= 1 && w >= 1 && e >= 1) {
            System.out.println("awe");
            counter++;
        }
        if (j >= 1 && o >= 1 && y >= 1) {
            System.out.println("joy");
            counter++;
        }
        if (l >= 1 && o >= 1 && v >= 1 && e >= 1) {
            System.out.println("love");
            counter++;
        }
        if (g >= 1 && r >= 1 && i >= 1 && e >= 1 && f >= 1) {
            System.out.println("grief");
            counter++;
        }
        System.out.println(counter);
    }
}
