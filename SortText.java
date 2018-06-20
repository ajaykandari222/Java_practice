import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortText {
	
	public static void main(String[] args) {

		 BufferedReader reader = null;
		 BufferedWriter writer = null;
		 
	    ArrayList<String> list = new ArrayList<String>();
		 try {
			reader = new BufferedReader(new FileReader("D:\\Users\\kandaria\\Documents\\sort.txt"));
	         
			    try {
				   String currentLine = reader.readLine();
				
			          while (currentLine!= null) {
			           list.add(currentLine);
			         currentLine = reader.readLine();
		         	}
			     
			    
		         Collections.sort(list);
		     
		     
				writer = new BufferedWriter(new FileWriter("D:\\Users\\kandaria\\Documents\\sortedd.txt"));
			
				for(String line : list) {
				  writer.write(line);
				  writer.newLine();
				   }
			    }
			    catch (IOException e) {
			    	e.printStackTrace();  }
		     
		 } 
		 
		 catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 finally
		 {
	              try
	            {
	                if (reader != null)
	                {
	                    reader.close();
	                }
	                 
	                if(writer != null)
	                {
	                    writer.close();
	                }
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	}

	}
}

