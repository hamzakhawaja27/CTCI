package chapter5;

public class Conversion5_6 {

	public static int convert(int item1, int item2){
		int count=0;
		for(int i=item1^item2; i!=0 ;i = i >> 1){
			count += i & 1;
		}		
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(29,15));
	}

}
