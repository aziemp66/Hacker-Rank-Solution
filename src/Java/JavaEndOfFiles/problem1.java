package Java.JavaEndOfFiles;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            i++;
            System.out.println(i+ " " + scanner.nextLine());
        }
    }
}
