package chapter5;

public class PairWiseSwap5_7 {

	public static int PairWiseSwap(int item){
		for(int i=0; i<Integer.BYTES*8;i+=2){
		int first=((int) (item/(Math.pow(2, i))) & 1 );
		int second=((int) (item/(Math.pow(2, i+1))) & 1);
		item = (item & ~(1<<i)) | (second<<i);	
		item = (item & ~(1<<(i+1))) | (first<<i+1);
		}
		
		return item;
		
	}
	
	public static int pairwisebook(int n){
		return ((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1);
	}
	
	public static void main(String[] args) {
		System.out.println(PairWiseSwap(8));
		System.out.println(pairwisebook(16));
		
	}

}
