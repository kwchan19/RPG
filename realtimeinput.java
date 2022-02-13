import hsa.*;

public class realtimeinput{
  public static void main(String[] args){ 
    Console con = new Console();
    
    
    int intCounter;
    char chrKeypress;
    
    
    for(intCounter = 0; intCounter < 1000; intCounter++){
      con.println("Count: "+intCounter);
      if(con.isCharAvail() == true){
        chrKeypress = con.getChar();
        con.println("The character pressed is: "+chrKeypress);
      }
      pause(100);
      
      
      
      
    }
  
  
  
  }
  public static void pause(int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e){
      
    }
      
    
  }
}