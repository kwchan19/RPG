import hsa.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
public class rpg{
  public static void main(String[] args){
    Console con = new Console(50,80);  
    
    // Main Menu
    
     
    
    
    
    
    
    
    String strMap;
 
    BufferedImage tree = null;
    BufferedImage layout = null;
    BufferedImage theCanvas = null;
    BufferedImage dirt = null;
    BufferedImage water = null;
    BufferedImage reddirt = null;
    BufferedImage grass = null;
    BufferedImage hole = null;
    BufferedImage hedge = null;
    BufferedImage charfront = null;
    BufferedImage housep1 = null;
    BufferedImage housep2 = null;
    BufferedImage housep3 = null;
    BufferedImage housep4 = null;
    
    
    
    TextInputFile map;
    //    map = new TextInputFile("map.txt");
    //    strMap = map.readLine();
      //    map.println(strMap);
         
    int intX;
    int intY;
    int intTime = 0;
    int intMap = 1;
      
    int intRight = 30;
    int intLeft = -30;
    int intUp = 30;
    int intDown = -30;
    int intRow;
    int intCol;
    char charMap;
    String strMapHome;
    
    char getChar;
    String array[][];
    array = new String[20][20];
    
        
    theCanvas = new BufferedImage(600, 600,  BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics = theCanvas.createGraphics();
    // Load image into a variable
    try{
//      tree = ImageIO.read(new File("tree.gif"));
//      layout = ImageIO.read(new File("layout.gif"));
//      dirt = ImageIO.read(new File("dirt.gif"));
//      water = ImageIO.read(new File("water.gif"));
//      reddirt = ImageIO.read(new File("reddirt.gif"));
//      grass = ImageIO.read(new File("grass.gif"));
//      hole = ImageIO.read(new File("hole.gif"));
//      hedge = ImageIO.read(new File("hedge.gif"));
      charfront = ImageIO.read(new File("charfront.gif"));
//      housep1 = ImageIO.read(new File("h1.png"));
//      housep2 = ImageIO.read(new File("h2.png"));
//      housep3 = ImageIO.read(new File("h3.png"));
//      housep4 = ImageIO.read(new File("h4.png"));
//      
      
    }catch(IOException e){
      }
      
      
    int intCounter;

  
    array = new String[20][20];

    
    array = utils.loadValues("map");
    for(intRow = 0;intRow <20;intRow++){
     
      for(intCol = 0;intCol <20; intCol++){
        charMap=array[intRow][intCol].charAt(0);
        if(charMap=='g'){
          con.drawImage(grass,5+intCol*30,5+intRow*30,null);
        }
        if(charMap=='t'){
          con.drawImage(tree,5+intCol*30,5+intRow*30,null);
          
        }
        if(charMap=='w'){
          con.drawImage(water,5+intCol*30,5+intRow*30,null);
        }
  
    
    while(intTime == 0){
    
      if(intMap ==1){
        
        intX = 125 + (5 * 30);
        intY= 305 + (5 * 30);
        
        Mapmethods.Map(con);
        Mapmethods.Map(con);
        Mapmethods.Hud(con);
        

        con.drawImage(charfront, intX, intY, null);
        
        for(intRow = 0; intRow <20; intRow ++){
          for(intCol = 0; intCol <20; intCol++){
            
            charMap = (array[intRow][intCol]).charAt(0);
            
            getChar = con.getChar();   
            
            if(getChar=='d'){
              Mapmethods.Map(con);
              con.drawImage(charfront, intRight + intX, intY, null);
              intX = intX + 30;
              
            }else if(getChar=='a'){
              Mapmethods.Map(con);
              con.drawImage(charfront,intLeft + intX, intY, null);
              intX = intX - 30;           
              
            }else if(getChar=='s'){
              Mapmethods.Map(con);
              con.drawImage(charfront, intX, intUp + intY, null);
              intY = intY + 30;
              
            }else if(getChar=='w'){
              Mapmethods.Map(con);
              con.drawImage(charfront,intX, intDown + intY,null);
              intY = intY - 30;
            
              
            }
            
          }
          }
          
        }
      }
    }
    }
  }
      
      
  
  
    
  
  public static void pause(int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e){
    }
  }
}