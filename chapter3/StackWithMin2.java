package chapter3;

public class StackWithMin2 extends MyStack<Integer>{
	MyStack<Integer> MinStack;
	
	public void push(int item){
		if(MinStack.isEmpty()) MinStack.push(item);
		else if(item<=min()){
			MinStack.push(item);
		}
		super.push(item);
	}
	
	public Integer pop(){
		if (MinStack.isEmpty()) throw new NullPointerException();
		if(super.pop()==min()){
			MinStack.pop();
		}
		
		return super.pop();
	}
	
	public Integer min(){
		if(this.MinStack.isEmpty()) return Integer.MAX_VALUE;
		return this.MinStack.peek();	
	}
	
	
	
}
