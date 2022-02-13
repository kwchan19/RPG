import hsa.Console;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;

public class animation{
  public static void main(String[] args){ 
    Console con = new Console();
    BufferedImage image1 = null;
    BufferedImage image2 = null;
    BufferedImage image3 = null;
    BufferedImage theCanvas = null;
    int intCounter;
    int intX = 600;
    int intY = 500;
    theCanvas = new BufferedImage(1024, 768,  BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics = theCanvas.createGraphics();
    // Load image into a variable
    try{
      image1 = ImageIO.read(new File("leftwalk.png"));
      image2 = ImageIO.read(new File("leftwalk2.png"));
      image3 = ImageIO.read(new File("leftwalk3.png"));
      
    }catch(IOException e){
    }
    // Draw that image on the screen in a loop
    for(intCounter = 100; intCounter < 770; intCounter--){
      // This time... draw to the "canvas" image buffer
      graphics.clearRect(0,0,1024,768);
      graphics.setColor(Color.WHITE);
      graphics.fillRect(0,0,1024,768);
      int intCount;
      for(intCount = 1;intCount<=2;intCount++){
        graphics.fillRect(0,0,1024,768);
        graphics.drawImage(Mapmethods.leftwalk("leftwalk"+intCount+".png"), intCounter*4, 100, null);
        pause(100);
        con.drawImage(theCanvas, 0, 0, null);
      }
      
      //graphics.drawImage(image3, 300, intY, null);
      // intX--;
      // intY--;
      // and draw that one image to the screen... much easier for the console to draw
      //con.drawImage(theCanvas, 0, 0, null);
      //pause(100);
    }
  }
  public static void pause(int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e){
    }
    
  }
}