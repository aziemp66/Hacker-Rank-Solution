package Java.JavaString;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 0, j = str.length()-1;
        boolean pallindrom = true;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                pallindrom = false;
                break;
            }
            i++;
            j--;
        }
        if (pallindrom){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
