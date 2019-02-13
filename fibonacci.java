
import java.util.Scanner;


public class fibonacci {
    
    public static void main(String[] args) {
        
     int n,a = 0,b = 1;
        Scanner s = new Scanner (System.in);
             n=s.nextInt();
             System.out.println("fibonacci series:");
        for(int i=1;i<=n;++i)
        {
       int c =a+b;
        a=b;
        b=c;
           
      
            System.out.println(a+ "");  
        if (a%2==0)
        {
            int sum=0;
            sum=sum+a;
            
    }
        
        } 
  }
}