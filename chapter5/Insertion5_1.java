package chapter5;

public class Insertion5_1 {

	public static int InsertionBits(int M,int N,int i,int j){
		
		int mask=(-1 << j+1) | ((1 << i)-1);
		N=N & mask;
		M=M << i;
		
		return N|M;
		
		
	}
	
	
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(InsertionBits(19, 1024, 2, 6)));
	}
}
