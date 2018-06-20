import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		String[] arr = {"abc", "def", "ghi", "jkl", "abc", "jkl"};
		
		/*
		 * Brute force
		 * for(int i=0; i< arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if((arr[i].equals(arr[j])) && (i != j)) {
					System.out.println(arr[i]);
				}
			}
		}*/
		
		
		HashSet<String> HS = new HashSet<String>();
		for(String Str : arr) {
			if(!HS.add(Str)) {System.out.println(Str);}
		}
	
		
	
	
	}

}
