package Java.StaticInitializerBlock;

import java.util.Scanner;

public class problem1 {
        static Scanner scanner = new Scanner(System.in);
        static int a = scanner.nextInt();
        static int b = scanner.nextInt();
        static boolean flag = true;
        static {
            try {
                if (a <= 0 || b <= 0){
                    flag = false;
                    throw new Exception("Breadth and height must be positive");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    public static void main(String[] args) {
        if (flag) {
            int area = a*b;
            System.out.println(area);
        }
    }

}
