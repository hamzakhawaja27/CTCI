package chapter5;

public class BinaryToString5_2 {

	public static String BinaryToString(double item){
		if(item>=1 || item<=0) return "Error";
		String output = ".";
		while(item!=0){
			System.out.println(item);
			if(output.length()>32) return "Error";
			item*=2;
			if(item>=1){
				output+="1";
				item-=1;
			}
			else{
				output+="0";
			}	
		}
		return output;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(BinaryToString(0.75));
	}

}
