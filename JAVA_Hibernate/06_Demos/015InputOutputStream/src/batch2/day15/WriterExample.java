package batch2.day15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public class WriterExample {

    public static void main(String[] args) {  
                  
    //	Writer w;
        	
			try(Writer w=new FileWriter("D:\\test.txt")) 
			{				
			
            String content = "I love my country";      
                     
            w.write(content);            
            
			} catch (IOException e) 
			{
			e.printStackTrace();
			}  
            System.out.println("Done");  
            
         
    }  

}


