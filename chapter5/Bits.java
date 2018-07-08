package chapter5;

public class Bits {

	public boolean getbit(int item,int i){
		int mask = 1 << i ;
		return (item & mask) !=0;
	};
	public int setbit(int item,int i){
		int mask = 1 << i;
		return item | mask;
	}
	public int clearbit(int item, int i){
		int mask = ~(1<<i);
		return item & mask;
	}
	public int clearbitsFirstI(int item, int i){
		int mask = (1 << i ) - 1;
		return item & mask;
	}
	public int clearbitsLastI(int item, int i){
	int mask = -1 << (i+1);
	return item & mask;
	}
	
	public int updatebit(int item,int i,boolean isOne){
		int value= isOne ? 1:0;
		item = item & ~(1<<i);
		return item | (value<<i);
		
		
	}
	
}
