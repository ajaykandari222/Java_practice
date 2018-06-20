import java.io.IOException;

public class ExecuteProgram {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		try {
			runtime.exec("Notepad.exe");
			runtime.exec("Notepad D:\\Users\\kandaria\\Desktop\\Doc\\Zerodha.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
