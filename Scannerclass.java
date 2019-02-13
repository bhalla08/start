import java.util.Scanner;
public class Scannerclass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("hey! welcome what is your name?");
        String name=input.nextLine();
        System.out.println("hey!" +name);
    }
}
/*
There are lots of different ways to get input from users – keyboards, mice, touch screens, speech, etc. Java uses different classes of objects to handle this variety of different input mechanisms. The object we will use for the console keyboard is called "Scanner" and it is designed to handle text input. It is not built in, so we need to tell Java to look for it in the util library with this special line at the beginning of our program:

import java.util.*;
Then, typically in a method, we create our own Scanner object with a name we define, like "input" and tell it to read text from System.in (the equivalent of the System.out we use for output):

Scanner input = new Scanner(System.in);
Finally, we tell our object to get the next complete line of input from the user into a String variable:

String name = input.nextLine();
Whew! That’s a lot more complicated than output with println()! It’s also a lot more powerful, and these three lines will make much more sense once we put them all together in a program.

LearnScanner.java

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name);
    }
}
The above code creates a new scanner and allows the user to type in any String. When Java gets to the line "input.next()" it pauses and waits for the user to type something into the console and hit "enter", then it picks back up where it left off. In this case you can type in any String without white space and it will be stored in the variable "name".

What if you want to get an int or a double instead of a String? Easy:

int count = input.nextInt();
double  amount = input.nextDouble();
These allow the user to enter in numbers that you then save in the appropriate data types. Maybe you want to get some more information about your user you could read in multiple items like this:

String name = input.next();
int age = input.nextInt();
double weight = input.nextDouble();
System.out.println(name + " is " + age + " year old and weighs " + weight + "kg”)
The one drawback to this simple use of a Scanner is that if you expect the user to enter and integer, and then enter something else, the program will immediately end with a cryptic error message like:

Exception in thread "main" java.util.InputMismatchException
The same problem happens with a double, although the scanner will happily accept an integer input and convert it to a double just like it does in an assignment statement. There are ways of dealing with this cleanly, but we’re going to trust the user to enter the right things for now!

You can also let the user enter in as much as they like, including spaced by using the nextLine method. This will return a String of everything the user types before they hit "enter".

String line = input.nextLine();


name.nextInt()-- will accept the integer value from the user..
name.next()-- will accept the string value from the user without spaces..
 name.nextDouble()-- will accept the double  value from the user..
 name.nextLine()-- will accept the values from the user until the enter key is hit..

 */