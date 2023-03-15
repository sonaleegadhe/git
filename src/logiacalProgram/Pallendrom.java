package logiacalProgram;

public class Pallendrom {
	
	public static void main(String[] args) {
		
		String S2="MOM";
		String Rev="";
		
		for(int i=S2.length()-1; i>=0; i--) {
			
			Rev=Rev+S2.charAt(i);
		}
		
		if(S2.equals(Rev)) {
			
			System.out.println("Given string is pallendrom");
		}
		else {
			System.out.println("given string is not pallendrom");
		}
	}

}
