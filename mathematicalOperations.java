public class mathematicalOperations {
    public static void main(String[] args) {
        double x;
        double y;
        x=10;
        y=20;
        System.out.println(" x + y = "  +(x+y));
        System.out.println(" x - y = "  +(x-y));
        System.out.println(" x * y = "  +(x*y));
        System.out.println(" x / y = "  +(x/y));
    }
}
/*Mathematical Operations
Basic Math
You can write arithmetic expressions in Java just like you do in algebra. Addition(+), subtraction (-), multiplication (*) and division(/) all work for both int and real data types. You can use parentheses as well to force an evaluation to have a higher level or precedence. The order of operations is left to right, and the precedence is also the same as in algebra:

Parentheses
Multiply and Divide
Add and Subtract
Many algebra teachers summarize this as PEMDAS, but in Java, it’s really PMDAS because there is no exponent operator.

Dividing two integers in Java can be a little confusing: 7 / 2 gives a result of 3, not 3.5! That’s because when Java divides two integers, it drops (or “truncates”) the decimal part to make the result an integer too. It does not round!

Java does provide another operator for getting the remainder: %, generally called “mod”, short for modulus. For example:

7 % 2 == 1
15 % 4 == 3
6 % 2 == 0
Shortcuts
Java provides some extra arithmetic operators for things that programs do frequently. They don’t do anything you can’t do with the simple +, -, *, / and % operators; they’re just quicker to write, and, once you’re fluent in Java, easier to read at a glance. These operators work with both integers and doubles:

operator	example	equivalent
++	x++;	x = x + 1;
--	x--;	x = x – 1;
+=	x += y;	x = x + y;
-=	x -= y;	x = x – y;
*=	x *= y;	x = x * y;
/=	x /= y;	x = x / y;
%=	x %= y;	x = x % y;
Mixed int and double expressions
Whenever Java applies an operator to two int values or variables, the result is also of type int; when it’s two doubles, the result is always a double. But, if you use an operator with one int and one double, the result is always a double, and it doesn’t matter which comes first. This makes sense since every int can be represented as a double, but certainly not vice versa! So, all of these evaluate to 1.5:

3.0 / 2 == 1.5
3 / 2.0 == 1.5
3.0 / 2.0 == 1.5
And, all of these evaluate to 2.0 (a double), not 2 (an int):

3.0 - 1 == 2.0
3 - 1.0 == 2.0
3.0 - 1.0 == 2.0
This seems very simple, but when you combine it with the order of operations, it can become confusing. For example,

7 / 2 * 2.0  == 6.0
BUT
2.0 * 7 / 2 == 7.0
In the first, Java divides the two integers 7/2 and gets the integer 3, and then multiplies the integer by the double 2.0 to get a double 6.0. In the second, it multiplies the double 2.0 by 7 and gets the double 14.0, and then divides that double by the integer 2 and gets the double 7.0. The order in which you write an expression matters a lot when using a combination of integers and doubles!

Here are some examples of how the computer would evaluate some expressions that combine types, step by step:

*/