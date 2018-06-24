package chapter1;

public class Compress1_6 {

	public static String compress(String input){

		String out="";
		int tail=0;
		int count=0;
		char[] in=input.toCharArray();
		for(char c:in){
			
			if(count!=0){
				
				if(in[count-1]!=c){
					
					out=out.concat(String.valueOf(in[count-1]));
					out=out.concat(String.valueOf(count-tail));
					tail=count;
				}
			}
			
			count++;
		}
		
		
		out=out.concat(String.valueOf(in[count-1]));
		out=out.concat(String.valueOf(count-tail));

		return out;
	}
	
	
	public static void main(String[] args) {
		
	System.out.println(compress("abbcccddddeeeee"));
		
	}

}
