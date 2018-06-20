
public class StringReverse {
	
	public static void main(String[] args) {

		String Str = "ReverseString";
		
		/*StringBuffer SF = new StringBuffer(Str); 
		 System.out.println(SF.reverse());*/ 
		
		/*char[] arr = Str.toCharArray();
		for(int i = arr.length-1 ; i>=0 ; i--) {System.out.print(arr[i]);}*/
		
		System.out.print(Reverse(Str));
	}

	static String Reverse(String Str) {
		
		if((Str==null) || (Str.length() <=1 )) {
			return Str;
		}
		else {
			
			return Reverse(Str.substring(1)) + Str.charAt(0);
		}
	}
	
}
