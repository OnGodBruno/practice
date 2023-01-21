import java.util.Scanner;

public class Calculator {

    //test class
    public static void main(String[] args) {
        //TODO: Make a simple Calculator in java!

        Operator operator = new Operator(); //TODO: Implement Addition, Subtraction,
                                            //TODO: Multiplication and Division!

        float num1 = getFirstNumber(); //Reads in first Number (Click in Console if it doesn't automatically);
        float num2 = getSecondNumber(); //Reads in second Number

        //Addition already implemented as an example
        float result = Operator.add(num1, num2);

        //TODO: b) Implement Subtraction by implementing it in Operator, then change Operator.add to
        //TODO: Operator.subtract(num1, num2);

        //TODO: c) Implement Multiplication by implementing it in Operator, then change Operator.add to
        //TODO: Operator.multiply(num1, num2);

        //TODO: d) Implement Subtraction by implementing it in Operator, then change Operator.add to
        //TODO: Operator.divide(num1, num2); WATCH FOR DEFENSIVE PROGRAMMING! (when should exception be thrown)?

        //TODO: e) Extra Hard! Implement Operator.power(num1, num2) for example: num1^num2, use c) to implement that!

        //TODO: f) Bonus: implement Operator.root(num1); that simply checks if the root of the number is a whole number
        //TODO and if so, return that value, otherwise throw an Illegal Argument exception.

        //TODO: g) Optional: Implement simple JavaDoc for the functions

        System.out.println(result);
    }
    private static float getFirstNumber() {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("Enter first Number: ");
        str = sc.nextLine(); //uses Scanner to read string
        return Float.parseFloat(str);
    }

    private  static  float getSecondNumber() {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("Enter second Number: ");
        str = sc.nextLine(); //uses Scanner to read string
        return Float.parseFloat(str);
    }
}
