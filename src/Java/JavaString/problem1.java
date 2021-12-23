package Java.JavaString;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int stringSum = A.length() + B.length();
        int lexicon = A.compareTo(B);
        String capitalAppend = A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(stringSum);
        if (lexicon > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(capitalAppend);
    }
}
