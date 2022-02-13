import hsa.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;

public class utils{
  
  
  
   
  public static void pause(int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e){
    }
  }
  
  
  
 
  
  
  public static String[][] loadValues(String map){
    
    String strString[][];
    String strCode;
    int intRow;
    int intCol;
    TextInputFile map1;
    String strSplit[];
    
    strString = new String[20][20];
    
    map1 = new TextInputFile(map +".csv");
    for(intRow = 0; intRow <20;intRow++){
       strCode = map1.readString();        
     for(intCol = 0; intCol <20;intCol++){
      
strSplit = strCode.split(",");
       strString[intRow][intCol] = strSplit[intCol];
     
    }
    

    }
     map1.close();
    return strString;
    
  }
}


