import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale uslocale=new Locale("en","US");
        NumberFormat usformat=NumberFormat.getCurrencyInstance(uslocale);
        String us=usformat.format(payment);
        
        Locale inlocale=new Locale("en","IN");
        NumberFormat informat=NumberFormat.getCurrencyInstance(inlocale);
        String india=informat.format(payment);
        
        Locale clocale =new Locale("zh","CN");
        NumberFormat cformat=NumberFormat.getCurrencyInstance(clocale);
        String china=cformat.format(payment);
        
        Locale flocale=new Locale("fr","FR");
        NumberFormat fformat=NumberFormat.getCurrencyInstance(flocale);
        String france=fformat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
