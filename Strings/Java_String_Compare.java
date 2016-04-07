import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n = sc.nextInt();
     
        
        char[] chars = new char[n];
        Arrays.fill(chars, 'A');
        String MAX = new String(chars);
        Arrays.fill(chars, 'z');
        String MIN = new String(chars);

        
        for(int i=0; i<=s.length()-n; i++){
           String temp = s.substring(i,i+n);
           if(temp.compareTo(MAX)>0) MAX = temp;
           if(temp.compareTo(MIN)<0) MIN = temp; 
        }
        System.out.println(MIN);
        System.out.println(MAX);
       
    }
}
