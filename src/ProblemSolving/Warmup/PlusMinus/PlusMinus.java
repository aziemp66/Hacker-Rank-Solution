package ProblemSolving.Warmup.PlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        double positives = 0;
        double negatives = 0;
        double zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i) > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        double totalPositives = positives / n;
        double totalNegatives = negatives / n;
        double totalZero = zero / n;
        System.out.printf("%.6f\n", totalPositives);
        System.out.printf("%.6f\n", totalNegatives);
        System.out.printf("%.6f\n", totalZero);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
