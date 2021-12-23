package Java.JavaLoops2;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            double result = a + (Math.pow(2, 0) * b);
            System.out.print(Math.round(result)+" ");
            for ( int j = 1 ; j < n ; j++){
                result+=Math.pow(2,j)*b;
                System.out.print((int)result+" ");
            }
            System.out.println();
        }
    }
}
