import hsa.Console;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
public class tree{
  public static void main(String[] args){ 
    Console con = new Console();
    BufferedImage image1 = null;
    BufferedImage theCanvas = null;
    int intCounter;
    int intX = 600;
    int intY = 500;
    theCanvas = new BufferedImage(20, 20,  BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics = theCanvas.createGraphics();
    // Load image into a variable
    intCounter = 0;
    try{
      image1 = ImageIO.read(new File("tree.jpg"));
      
    }catch(IOException e){
    }
    // Draw that image on the screen in a loop

      // This time... draw to the "canvas" image buffer
      graphics.clearRect(0,0,20,20);
      graphics.setColor(Color.WHITE);
      graphics.fillRect(0,0,20,20);
      graphics.drawImage(image1, intCounter, 100, null);

      intX--;
      intY--;
      // and draw that one image to the screen... much easier for the console to draw
      con.drawImage(theCanvas, 20, 20, null);
      
      pause(10);
    
  }
  public static void pause(int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e){
    }
    
  }
}