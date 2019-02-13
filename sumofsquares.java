
public class sumofsquares {
    public static void main(String[] args) {
        int n=100,sosq=0,sqos=0,diff,temp;
        for (int i = 1; i <= n; i++) {
            sosq=sosq+i*i;
        }
        System.out.println("sum of squares"+sosq);
         for (int j = 1; j <= n; j++) {
            sqos=(sqos+j);
        }
         temp=sqos*sqos;
        System.out.println("square of sum"+temp);
        diff=temp-sosq;
        System.out.println("DIFFERENCE=" +diff);
    }
}
