package chapter3;

class MinNode{
	int val;
	int min;
	
	public MinNode(int val, int min){
		this.val=val;
		this.min=min;
	}
	
}

public class StackWithMin extends MyStack<MinNode>{
	
	public void push(int input){
		int min = Math.min(input, this.min()) ; 
		MinNode item = new MinNode(input, min);
		super.push(item);
	}

	public int min(){
		if(this.isEmpty()) return Integer.MAX_VALUE;
		return peek().min;
	}
	
	
	public static void main(String[] args) {
		

	}

}
