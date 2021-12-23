package ProblemSolving.Warmup;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        for(int i = 0; i < alice.length;i++){
            alice[i] = scanner.nextInt();
        }
        for(int i = 0; i < bob.length;i++){
            bob[i] = scanner.nextInt();
        }
        int aliceCounts = 0;
        int bobCounts = 0;
        for(int i = 0; i < bob.length;i++){
            if(bob[i] > alice[i]){
                bobCounts++;
            } else if (alice[i] > bob[i]){
                aliceCounts++;
            }
        }
        System.out.println(aliceCounts+" "+bobCounts);
    }
}
