package chapter3;

import java.util.LinkedList;

class Animal{
	
	String name;
	int order;
	public Animal(String name){
		this.name=name;
	}
	
	public void setorder(int order){
		this.order=order;
	}
	public Integer getorder(){
		return this.order;
	}	

}

class dog extends Animal{
	public dog(String n){
		super(n);
	}
}	
class cat extends Animal{
	public cat(String n){
		super(n);
	}
}
	
public class Animals3_6 {
	
	LinkedList<dog> doglist = new LinkedList<dog>();
	LinkedList<cat> catlist = new LinkedList<cat>();
	int order=0;
	public void enqueue(Animal a){
		a.setorder(order);
		if(a instanceof dog) doglist.add((dog)a);
		if(a instanceof cat) catlist.add((cat)a);
		order++;
	};
	
	public Animal dequeueAny(){
		Animal A = doglist.peekFirst().order < catlist.peekFirst().order ? doglist.removeFirst():catlist.removeFirst();
		return A;
	};
	
	public dog dequeueDog(){
		return doglist.removeFirst();
	};
	public cat dequeueCat(){
		return catlist.removeFirst();
	};
	
	

}
