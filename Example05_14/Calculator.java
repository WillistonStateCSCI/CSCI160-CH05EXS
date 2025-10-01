/* A simple calculator
   Anderson, Franceschi
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator
{
  public static void main( String [ ] args )
  {
    Scanner scan = new Scanner( System.in );

    // set up the output format of the result
    DecimalFormat twoDecimals = new DecimalFormat( "#,###.##" );

    // print a welcome message
    System.out.println( "Welcome to the Calculator" );

    //  define and print a menu, then prompt for the operation
    String menu = """
      Operations are:
      \tADD or + for addition
      \tSUBTRACT or - for subtraction
      \tMULTIPLY or * for multiplication
      \tDIVIDE or / for division""";
    System.out.println( menu );
    System.out.print( "Enter your operator: " );
    String operation = scan.next( );
    operation = operation.toUpperCase( );

    // read the two operands
    System.out.print( "Enter the first operand: " );
    double fp1 = scan.nextDouble( );
    System.out.print( "Enter the second operand: " );
    double fp2 = scan.nextDouble( );

    // perform the operation
    String result = switch ( operation )
    {
      case "ADD", "+" -> twoDecimals.format( fp1 + fp2 );
      case "SUBTRACT", "-" -> twoDecimals.format( fp1 - fp2 );
      case "MULTIPLY", "*" -> twoDecimals.format( fp1 * fp2 );
      case "DIVIDE", "/" -> 
      {
        if ( fp2 == 0.0 )
          yield "Dividing by 0 is not allowed";
        else
          yield twoDecimals.format( fp1 / fp2 );
      }
      default -> "invalid operation";
    };
    
    // output the result of the operation
    System.out.println( "The result is: " + result );
  }
}
