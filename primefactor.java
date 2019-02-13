
import java.util.Scanner;


public class primefactor {
    
    public static void main(String[] args) {
       int n;
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
       n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            while(n%i == 0)
            {
                System.out.println(i+" ");
                n = n/i;
            }
        }
        if (n>2) {
            System.out.println(n);
        }
                    
    }
}


