/* Drawing a smiley face
   Anderson, Franceschi
*/

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import java.util.Scanner;
 
public class SmileyFaceDraw extends Application
{
  @Override
  public void start( Stage stage ) 
  {
    // set up window title and size
    GraphicsContext gc = JIGraphicsUtility.setUpGraphics( 
                  stage, "Draw a Smiley Face", 400, 400 );
    
    final int X = 100, Y = 100, RADIUS = 100;
       
    // ask the user for a rating
    Scanner scan = new Scanner( System.in );
    System.out.print( "Enter a rating (1 to 5) > " );
    int rating = scan.nextInt( );

    // Draw the face and the eyes
    gc.setFill( Color.YELLOW );
    gc.fillOval( X, Y, 2 * RADIUS, 2 * RADIUS );
    gc.setFill( Color.BLACK );
    gc.fillOval( X + RADIUS / 3, Y + RADIUS / 3, 
                 RADIUS / 3, RADIUS / 3 );
    gc.fillOval( X + 4 * RADIUS / 3, Y + RADIUS / 3, 
                 RADIUS / 3, RADIUS / 3 );

    // Draw the smile
    switch ( rating )
    {              
      case 1, 2 ->
        gc.strokeArc( X + RADIUS / 2, Y + RADIUS, 
                      RADIUS, RADIUS / 2, 0, 180, ArcType.OPEN );
      case 4, 5 ->
        gc.strokeArc( X + RADIUS / 2, Y + RADIUS, 
                      RADIUS, RADIUS / 2, 0, -180, ArcType.OPEN );
      default ->
        gc.strokeLine( X + RADIUS / 2, Y + 4 * RADIUS / 3, 
                       X + 3 * RADIUS / 2, Y + 4 * RADIUS / 3 );
    } // end switch                  
  }    
    
  public static void main( String [ ] args ) 
  {
    launch( args );
  }    
}