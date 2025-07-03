import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
       Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int sum=a;
            for(int j=0;j<n;j++){
                sum+=(int)Math.pow(2, j)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
         }
            
        }
       
}
