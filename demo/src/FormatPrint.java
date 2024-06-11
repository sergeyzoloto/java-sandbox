public class FormatPrint {

  public static void main(String[] args) {
    
    // printf() = an optional method to control, format, and display text to the console window
    //            two arguments = format string + (object/variable/value)
    //            % [flags] [precision] [width] [conversion-character]

    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Bro";
    int myInt = 50;
    double myDouble = 1000;

    // [conversion-character]
    System.out.printf("%b\n", myBoolean); // %b = formats the output as boolean
    System.out.printf("%d\n", myInt); // %d = formats the output as decimal integer
    System.out.printf("%.3f\n", myDouble); // %f = formats the output as floating point number
    System.out.printf("%c\n", myChar); // %c = formats the output as character
    System.out.printf("%s\n", myString); // %s = formats the output as string
    
    // [width]
    // minimum number of characters to be written as output
    System.out.printf("Hello %10s\n", myString); // %10s = width of 10 characters

    // [precision]
    // sets number of digits of precision when outputting floating-point values
    System.out.printf("You have this much money %.2f\n", myDouble); // %.2f = 2 digits of precision

    // [flags]
    // adds an effect to output based on the flag added to format specifier
    // - : left-justify
    // + : output a plus ( + ) or minus ( - ) sign for a numeric value
    // 0 : numeric values are zero-padded
    // , : comma grouping separator if numbers > 1000
    System.out.printf("You have this much money %,f\n", myDouble); // %,f = comma grouping separator
    
  }
}