import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what are your overall grade percentage");
        int grade=input.nextInt();


        if (grade>40)
            System.out.println("yay! you got admission welcome to the family!!!!!!!");
        else
            System.out.println("sorry! better luck next time");
    }
}
