package Java.JavaStringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine().trim();
        if(myStr.length() > 40000){

        } else if (myStr.length() == 0){
            System.out.println(0);
        } else {
            StringTokenizer st = new StringTokenizer(myStr, ",\\'\\?\\ ");
            System.out.print(st.countTokens());
            int count = 0;
            while (st.hasMoreTokens()) {
                count++;
                if (count == 20) {
                    System.out.print("{-truncated-}");
                    break;
                }
                System.out.print("\n" + st.nextToken());
            }
        }
    }
}
