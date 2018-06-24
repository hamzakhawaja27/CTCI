package Chapter2;

public class Intersection2_7 {

	public static Node Intersection(Node list1,Node list2){
		if(list1==null || list2==null) return null;
		
		EndNodeLength l1 = LE(list1);
		EndNodeLength l2 = LE(list2);
		
		if(l1.End!=l2.End)return null;
		
		Node shorter = l1.length<l2.length ? list1:list2;
		Node longer = l1.length<l2.length ? list2:list1;

		Node big = KthNode(longer, Math.abs(l1.length-l2.length));
		
		
		while(shorter!=null && big!=null){
			
			if(shorter==big){
				return shorter;
			}
			
			if(shorter.next!=null) shorter=shorter.next;
			else shorter=null;
			
			
			if(big.next!=null) big=big.next;
			else big=null;
		}
		
		return null;
	}
	
	public static Node KthNode(Node l,int k){
		int count=0;
		Node current=l;
		while(count<k && current!=null){
			count++;
			if(current.next!=null)current=current.next;
			
		}
		
		
		return current;
	}
	
	public static EndNodeLength LE(Node l){
		int length=0;
		Node End=null;
		while(l!=null){
			length++;
			End=l;
			if(l.next!=null)l=l.next;
			else l=null;
		}
		
		
	return new EndNodeLength(End,length);	
	}
	
	public static void main(String[] args) {
		Node l1=new Node(3);
		Node l2=new Node(2);
		l2.next=l1;

		System.out.println(Intersection(l1,l2).data);
	}

}
class EndNodeLength{
	Node End;
	int length;
	
	public EndNodeLength(Node x,int y){
		this.End=x;
		this.length=y;
		
	}
	
	
	
}