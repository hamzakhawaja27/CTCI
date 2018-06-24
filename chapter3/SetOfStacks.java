package chapter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class SetOfStacks<T> {
	int capacity;
	ArrayList<Stack<T>> AllStack = new ArrayList<Stack<T>>();
	
	public SetOfStacks(int capacity){
		this.capacity=capacity;
	}
	
	public void push(T item){
		Stack<T> currentStack = lastStack();
		currentStack.push(item);
	};
	public T pop(){
		Stack<T> currentStack = lastStack();
		T item = currentStack.pop();
		if(currentStack.isEmpty()) AllStack.remove(AllStack.size()-1);
		return item;
	};
	public T peek(){
		Stack<T> currentStack = lastStack();
		return currentStack.peek();
	};
	public boolean isEmpty(){
		if(AllStack.isEmpty()) return true;
		return false;
	};
	
	public Stack<T> lastStack(){
		int size = AllStack.size();
		if(AllStack.isEmpty() || size>=this.capacity){
			AllStack.add(new Stack<T>());
		}
		return AllStack.get(size-1);
	}

}
