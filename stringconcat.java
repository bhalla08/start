public class stringconcat {
    public static void main(String[] args) {

       String str1="Hello";
       String str2="World";
        System.out.println(str1+ " " + str2);
        System.out.println(str1 + " " + 123434);
    }
}
/*
Note that if you are combining mathematical operations and Strings Java will evaluate the expression from left to right, converting between types as appropriate. So the following expression:

1 + 2 + "3" + 4 + 5
... results in:

"3345"
However, the order of operations applies when combining mathematical operations and concatenation, like so:

1 * 2 + "3" + 4 * 5 = "2320"
If you’re concatenating two words or similar values you may need to add a String with a space character between them:

String firstName = "John";
String lastName = "Doe";
System.out.println(var1 + var2);
System.out.println(var1 + " " + var2);
... results in:

JohnDoe
John Doe

 */



/*
Casting
As the last two sections showed, you need to be careful when combining values of different data types. Java lets you explicitly change data from type to another or "cast" the data to a different type. You do this by expressly calling out what you want your data type to be after evaluation:

(resulting data type) expression;
The most common use is to cast a double into an integer for rounding the result of an integer by integer division instead of truncating it:

Expression	Value	Comment
10/4	2	a more accurate arithmetic result is 2.5, but as both numbers are ints the result is an int and the decimal is truncated
10/4.0	2.5	result is a double, so decimal is included
(int)(10/4.0)	2	takes double result of 2.5 and turns it into an int by dropping the decimal
(int)10/4.0	2.5	Without the parenthesis the 10 is cast to an int, even though it already is. The result is the int 10 / 4.0 who's result is 2.5
As the last expression shows, casting has higher precedence than any other operator (except parentheses, of course), and only cast the value immediately to its right.

You can also cast an int to a double, or accomplish the same thing by combining the types:

Expression	Value	Comment
(double)10	10.0	cast int to double
10*1.0	10.0	combine int with double


 */