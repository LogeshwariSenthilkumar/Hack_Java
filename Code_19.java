import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len=A.length()+B.length();
        System.out.println(len);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String[] s1=A.split("");
        s1[1]=s1[1].toUpperCase();
        String s2="";
        for(String ele:s1){
            s2+=ele;
            
        }
        String[] s3=B.split("");
        s3[1]=s3[1].toUpperCase();
        String s4="";
        for(String ele:s3){
            s4+=ele;
            
        }
        System.out.println(s2+" "+s4);
        
                
    }
}



