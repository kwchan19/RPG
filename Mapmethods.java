import hsa.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;








public class Mapmethods{
  
  
  public static BufferedImage leftwalk(String filename){
          BufferedImage leftwalkfile = null;
          try{
            
            leftwalkfile = ImageIO.read(new File (filename));
            
          }catch(IOException e){
            
          }
          return(leftwalkfile);
  }
  

    
  
   public static void Hud(Console con){
     
     BufferedImage hudbar = null;
     BufferedImage character = null;
     BufferedImage health10 = null;
     BufferedImage health20 = null;
     BufferedImage health30 = null;
     BufferedImage health40 = null;
     BufferedImage health50 = null;
     
     
     try{
       hudbar = ImageIO.read(new File("HUDBar.png"));
       character = ImageIO.read(new File("character.png"));
       health10 = ImageIO.read(new File("health10.png"));
       health20 = ImageIO.read(new File("health20.png"));
       health30 = ImageIO.read(new File("health30.png"));
       health40 = ImageIO.read(new File("health40.png"));
       health50 = ImageIO.read(new File("health50.png"));
       
       
     }catch(IOException e){
     }
     int intHP = 50;
     
     con.drawImage(hudbar,5,605,null);
     con.drawImage(character, 5, 605, null);
     
     if(intHP==10){
       con.drawImage(health10, 100, 630, null);
       
     }else if(intHP==20){
       con.drawImage(health20, 100, 630, null);
       
     }else if(intHP==30){
       con.drawImage(health30, 100, 630, null);
       
     }else if(intHP==40){
       con.drawImage(health40, 100, 630, null);
       
     }else if(intHP==50){
       con.drawImage(health50, 100, 630, null);
     }
       
   }
   
   public static void Map(Console con){
     
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
    
    
    
    try{
      tree = ImageIO.read(new File("tree.gif"));
      layout = ImageIO.read(new File("layout.gif"));
      dirt = ImageIO.read(new File("dirt.gif"));
      water = ImageIO.read(new File("water.gif"));
      reddirt = ImageIO.read(new File("reddirt.gif"));
      grass = ImageIO.read(new File("grass.gif"));
      hole = ImageIO.read(new File("hole.gif"));
      hedge = ImageIO.read(new File("hedge.gif"));
      charfront = ImageIO.read(new File("charfront.gif"));
      housep1 = ImageIO.read(new File("h1.png"));
      housep2 = ImageIO.read(new File("h2.png"));
      housep3 = ImageIO.read(new File("h3.png"));
      housep4 = ImageIO.read(new File("h4.png"));
      
    }catch(IOException e){
    }
    
    
    
    int intRow;
    int intCounter;
    int intCol;
    String array[][];
    array = new String[20][20];
    char charMap;
    
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
        
        if(charMap=='c'){
          con.drawImage(charfront, 5+intCol*30, 5+intRow*30, null);
        }
        if(charMap=='!'){
          con.drawImage(housep1,5+intCol*30,5+intRow*30,null);
        }
        if(charMap=='@'){
          con.drawImage(housep2,5+intCol*30,5+intRow*30,null);
        }
        if(charMap=='#'){
          con.drawImage(housep3,5+intCol*30,5+intRow*30,null);
        }
        if(charMap=='$'){
          con.drawImage(housep4,5+intCol*30,5+intRow*30,null);
          
        }
        
                 
        }
                        
    }
  }
}

      
      
  
        
   
        
      
      
    
    
    
  
    
  
    
    