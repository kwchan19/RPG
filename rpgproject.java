import hsa.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;

public class rpgproject{
  public static void main(String[] args){
    
    char charMove;
    
    String strMapRow1;
    String strMapRow2;
    String strMapRow3;
    String strMapRow4;
    String strMapRow5;
    String strMapRow6;
    String strMapRow7;
    String strMapRow8;
    String strMapRow9;
    String strMapRow10;
    String strMapRow11;
    String strMapRow12;
    String strMapRow13;
    String strMapRow14;
    
    //Text Input
    TextInputFile map;
    
    Console con = new Console();
    
    map = new TextInputFile("map.txt");
    
    strMapRow1 = map.readLine();
    strMapRow2 = map.readLine();
    strMapRow3 = map.readLine();
    strMapRow4 = map.readLine();
    strMapRow5 = map.readLine();
    strMapRow6 = map.readLine();
    strMapRow7 = map.readLine();
    strMapRow8 = map.readLine();
    strMapRow9 = map.readLine();
    strMapRow10 = map.readLine();
    strMapRow11 = map.readLine();
    strMapRow12 = map.readLine();
    strMapRow13 = map.readLine();
    strMapRow14 = map.readLine();
    
    
    
  }
   
  public static void pause(int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e){
      
    }
  }
}
    
