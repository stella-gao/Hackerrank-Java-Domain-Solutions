import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do{
            String s = sc.nextLine();
            count++;
            System.out.println(count+" "+s);
        }while(sc.hasNext());
    }
}
