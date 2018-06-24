package chapter3;
public class QueueViaStacks<T> {
	MyStack<T> first = new MyStack<T>();
	MyStack<T> second = new MyStack<T>();
	public void add(T item){
		first.push(item);
	}
	public T remove() throws Exception{
		if(this.isEmpty()) throw new Exception();
		ShiftStacks();
		return second.pop();
	};
	public T peek() throws Exception{
		if(this.isEmpty()) throw new Exception();
		return second.peek();
		
	};
	
	public boolean isEmpty(){
		if (first.isEmpty() && second.isEmpty()) return true;
		return false;
		
	};
	
	private void ShiftStacks(){
		if(second.isEmpty()){
			while(!first.isEmpty()){
				second.push(first.pop());
			}
		}
		
	}
}
