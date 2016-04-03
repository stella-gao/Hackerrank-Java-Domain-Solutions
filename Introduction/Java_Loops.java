import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                int x = ((int) Math.pow(2, j))*b;
                System.out.printf("%d ", sum + x);
                sum += x;
            }

            System.out.println();
        }
    }
}
