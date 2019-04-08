package ch01.sec06;

public class FormattedOutput {
    public static void main(String[] args) {
        // If either argument has a decimal, the result will be a decimal
        // If neither of the arguments have a decimal, the result will not either
        System.out.println(1000.0 / 3.0);
        System.out.println(1000 / 3);
        System.out.println(1000.0 / 3);
        System.out.println(1000 / 3.0);

        // Use the printf method to print with/without decimals
        // "%8.2f" 8 field width, 2 points of precision, f floating point number, %n new line
        System.out.printf("%8.2f%n", 1000.0 / 3);
        System.out.printf("%.2f%n", 1000.0 / 3);
        // Doesn't work because 1000/3 produces an integer instead of a floating point number?
         System.out.printf("%d%n", 1000 / 3);

         // each item needs to be templated with a conversion character
        String name = "Seven of Nine";
        // use string.format to format without printing
        String message = String.format("Hello, %s. %d divided by %d is %+.3f", name, 1000, 3, 1000.0/3*-1);
        System.out.println(message);
    }
}



