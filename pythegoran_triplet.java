
public class pythegoran_triplet {
    public static void main(String[] args) {
        int a,b=0,c=0;
        int s=1000;
        boolean found = false;
        
        for ( a = 1; a < s / 3; a++) {
            for ( b = a; b < s/2; b++) {
                c=s-a-b;
                if( a * a + b * b == c*c){
                found=true;
                    System.out.println("the values of a:"+a);
                    System.out.println("the values of b:"+b);
                    System.out.println("the values of c:"+c);
                break;               
                }
              }
            if(found=false)
            {
            break;
            }
        }
        
    }
}
