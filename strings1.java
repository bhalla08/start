public class strings1 {
    public static void main(String[] args) {
        "kasey".equals("KASEY");
    }
}
/*
Boolean expressions
In our last module, we introduced the boolean data type, which can have only two specific values: true or false. Boolean expressions that evaluate to true or false are how we can set up conditions for something to happen; for example, (cost > budget) means you can't afford something and (myScore > opponentScore) could mean I win the game. These types of condition express a "relation" between two values using a relational operator. Here are the Java relational operators:

Relational Operator	Meaning	Example Expression	Result
== 	equal to	1 + 1 == 2	true
!= 	not equal to	3.2 != 2.5	true
<	less than 	10 < 5 	false
> 	greater than	 10 > 5 	true
<=	less than or equal to 	126 <= 100 	false
>= 	greater than or equal to 	5.0 >= 5.0 	true
Note that the "equal to" operator is two equals signs right next to each other; this is to make it different than the single equals sign Java uses for assignment statements.

You can use these relational operators on the primitive data types- even char! However, they won't work with String variables. One of the most common Java mistakes by developers is trying to compare two strings using "==". Instead you have to use String's .equals method like so:

string1.equals(string2)
This is true if and only if the strings are exactly the same length, and all their characters match exactly. Either or both strings can be a variable. For example, if name contains "John Doe", all the following expressions are false:

name.equals("John"); // too short
name.equals("john doe"); // case doesn’t match
name.equals("John Doe "); // extra space at end
name.equals("John  Doe "); // extra space in middle
Here are the most commonly used String comparison methods that result in a boolean value of true or false and an example evaluates to true:

method 	example expression = true
equals	name.equals("John Doe")
equalsIgnoreCase	name.equalsIgnoreCase("john doe")
startsWith 	name.startsWith("Joh")
endsWith 	name.endsWith("Doe")
contains 	name.contains(" ")
 */