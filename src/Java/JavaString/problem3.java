package Java.JavaString;

import java.util.Scanner;
import java.util.Arrays;


public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine().toLowerCase();
        String yourString = scanner.nextLine().toLowerCase();
        char[] myChar = new char[myString.length()];
        char[] yourChar = new char[yourString.length()];
        for (int i = 0;i < myString.length();i++){
            myChar[i] = myString.charAt(i);
        }
        for (int i = 0; i < yourString.length();i++){
            yourChar[i] = yourString.charAt(i);
        }
        boolean anagrams = true;
        Arrays.sort(myChar);
        Arrays.sort(yourChar);
        if (myChar.length != yourChar.length){
            anagrams = false;
        } else {
            for (int i  = 0;i < myChar.length;i++){
                if (myChar[i] != yourChar[i]){
                    anagrams = false;
                    break;
                }
            }
        }
        if (anagrams) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
