package Java.JavaIntToString;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = Integer.toString(a);

        if (a == Integer.parseInt(b)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
