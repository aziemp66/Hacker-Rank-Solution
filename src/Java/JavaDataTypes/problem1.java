package Java.JavaDataTypes;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            try {
                long number = scanner.nextLong();
                if (number >= -128 && number <= 127) {
                System.out.println(number+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (number >= -32_768 && number <= 32_767){
                System.out.println(number+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (number >= -2_147_483_648 && number <= 2_147_483_647){
                System.out.println(number+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            } else {
                System.out.println(number+" can be fitted in:");
                System.out.println("* long");
            }
            }catch (Exception e){
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }
        }
    }
}
