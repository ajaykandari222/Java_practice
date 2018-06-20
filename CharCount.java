import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharCount {

	
	public static void main(String[] args) {

		BufferedReader reader = null;
		
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try	 {reader =  new BufferedReader(new FileReader("D:\\Users\\kandaria\\Notepad.txt"));
		
		String CurrentLine = reader.readLine();
		
		while(CurrentLine != null) {
			
			lineCount++;
			
			String[] words = CurrentLine.split(" ");
		    wordCount = wordCount + words.length;
		    
		    for(String word : words) {
		    	charCount = charCount + word.length();
		    }
		    
		    CurrentLine = reader.readLine();
		    
		}
		
		System.out.println("Number Of Chars In A File : "+charCount);
        
        System.out.println("Number Of Words In A File : "+wordCount);
         
        System.out.println("Number Of Lines In A File : "+lineCount);

		
		
		}
		catch(IOException e) {e.printStackTrace();}
		finally {try {reader.close();} catch (IOException e) {	e.printStackTrace();}}
		
	}

}
