package Java.JavaDateAndTime;

import java.util.Scanner;
import java.time.LocalDate;
public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dd = scanner.nextInt();
        int mm = scanner.nextInt();
        int yyyy = scanner.nextInt();
        scanner.close();
        LocalDate date = LocalDate.of(yyyy, mm, dd);
        System.out.print(date.getDayOfWeek());
    }
}
