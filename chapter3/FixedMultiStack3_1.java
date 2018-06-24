package chapter3;

public class FixedMultiStack3_1 {
	int Multistack=3;
	int capacity;
	int[] values;
	int[] size;
	
	public FixedMultiStack3_1(int capacity){
		this.capacity=capacity;
		values = new int[capacity*this.Multistack];
		size=new int[Multistack];
	}
	
	public void push(int StackNumber, int data) throws Exception{
		if(isFull(StackNumber)) throw new Exception();
		size[StackNumber]++;
		values[TopIndex(StackNumber)] = data;
	};
	public int pop(int StackNumber) throws Exception{
		if(isEmpty(StackNumber)) throw new NullPointerException(); 
		int data = values[TopIndex(StackNumber)];
		values[TopIndex(StackNumber)]=0;
		size[StackNumber]--;
		return data;
	};
	public int peek(int StackNumber){
		if(isEmpty(StackNumber)) throw new NullPointerException();
		return values[TopIndex(StackNumber)];
	};
	public boolean isEmpty(int StackNumber){
		return size[StackNumber]==0;
	};
	
	public boolean isFull(int StackNumber){
		return size[StackNumber]==capacity;
	};
	
	public int TopIndex(int StackNumber){
		int TopI = capacity * StackNumber + size[StackNumber] - 1;
		return TopI;
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
