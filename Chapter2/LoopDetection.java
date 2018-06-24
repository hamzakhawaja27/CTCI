package Chapter2;

public class LoopDetection {
	
	public static Node loopDetec(Node head){
		
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
				break;
		}
		
		if(fast==null || fast.next==null) return null;
		slow=head;
		while(fast!=slow){
			slow=slow.next;
			fast=fast.next;	
		}
		return fast;
		
	}
	
	
	
	
	

}
