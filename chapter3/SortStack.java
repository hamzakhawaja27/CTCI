package chapter3;

public class SortStack {

	public MyStack<Integer> SortThisStack(MyStack<Integer> sorted) throws Exception{
		if(sorted.isEmpty()) throw new Exception();
		MyStack<Integer> Buffersort = new MyStack<Integer>();	
		while(!sorted.isEmpty()){
			Integer item = sorted.pop();
			while(!Buffersort.isEmpty() && item > Buffersort.peek()){
				sorted.push((Buffersort.pop()));
			}
			Buffersort.push(item);
		}
		while(!Buffersort.isEmpty()){
			sorted.push(Buffersort.pop());
		}
		return sorted;
	}
	
	
	
	
}
