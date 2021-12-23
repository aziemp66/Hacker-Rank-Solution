package Java.JavaSubString;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(input.substring(a,b));
    }
}
