/* Comparing Object References and Data
   Anderson, Franceschi
*/
public class ComparingObjects
{
  public static void main( String [] args )
  {
    String s1 = new String( "Hello" );
    String s2 = new String( "Hello" );
    
    if( s1 == s2 )
      System.out.println( "Using ==, s1 and s2 are equal" );
    else
      System.out.println( "Using ==, s1 and s2 are different" );
      
    if( s1.equals( s2 ) )
      System.out.println( "Using equals, s1 and s2 are equal" );
    else
      System.out.println( "Using equals, s1 and s2 are different" );
  }
}
