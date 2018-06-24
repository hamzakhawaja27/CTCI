package chapter2;

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
	}
}

public class LinkedL {
	
	Node Head;
	
	public void append(int d){
		
		if(Head==null){
			Head= new Node(d);
			return;
		}
		Node current=Head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=new Node(d);
	}
	
	public void prepend(int d){
		Node newHead= new Node(d);
		newHead.next=Head;
		Head=newHead;
		
	}
	
	public void deleteWithValue(int d){
		Node current=Head;
		if(Head==null){
			return;
		}
		if(current.data==d){
			Head=current.next;
			return;
		}
		while(current.next!=null){
			if(current.next.data==d){
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
		
	}
	
	
	public static void main(String[] args){
/*
		LinkedL test = new LinkedL();
		
		test.append(10);
		test.append(13);
		test.append(1);
		test.append(12);
		test.append(15);
		test.append(17);
		
		test.prepend(2);
		test.prepend(5);
		
		test.deleteWithValue(12);
		test.deleteWithValue(10);
		
		Node current=test.Head;
		
		while(current!=null){
			
			System.out.println(current.data);
			current=current.next;
		}
		
*/	
		
		
		
	}
}

