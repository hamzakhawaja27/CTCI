package chapter1;

public class PalindromeP {
	
	public static boolean Pcheck(String input){
		
		int[] Farray= new int[26];
		int temp=0;
		input=input.toLowerCase();
		
		for(char c:input.toCharArray()){	
			Farray[(int) c - 97] = Farray[(int) c - 97] + 1;
			if( Farray[(int) c - 97] %2 == 1){
				
				temp=temp+1;
			}
			else{
				temp=temp-1;
			}
			}
	
	System.out.println(temp);	
	if(temp==0){
		return true;
	}
	if(temp == 1){
		
		if(input.length()%2==1){
			
			return true;
		}
		
	}
		
		return false;
	}

	
	
	
	public static void main(String[] args) {
		String s= "sas";
		System.out.println(Pcheck(s));
		
	}

}
