import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String original=A;
        String B="";
        for(int i=A.length()-1;i>=0;i--){
            B=B+A.charAt(i);
        }
        if(B.equalsIgnoreCase(original)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



