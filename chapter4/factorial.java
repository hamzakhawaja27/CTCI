package chapter4;

public class factorial {

	
	public static Integer factor(int item){
		if(item<0){
			return null;
		}		
		else if(item==0){
			return 1;
		}
		else{
			return item * factor(item-1);
		}

		
	}
	
	public static void main(String[] args){
		
		System.out.println(factor(10)-factor(5));
		
	}
	
	
	
	
	
}
