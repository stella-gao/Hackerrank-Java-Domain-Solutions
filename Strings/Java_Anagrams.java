import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase();
        char[] charsA = A.toCharArray();        
        char[] charsB = B.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        String sortedA = new String(charsA);
        String sortedB = new String(charsB);
        return (sortedA.equals(sortedB));
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
