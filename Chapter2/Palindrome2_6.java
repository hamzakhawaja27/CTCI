package Chapter2;

public class Palindrome2_6 {
	
    public static boolean isPalindrome(Node head) {
    	
    	Node current=head;
    	Node temp=null;
    	Node head_output=null;
    	while(current!=null){
    		head_output = new Node(current.data);
    		head_output.next=temp;
    		System.out.println(current.data);
    		if(current.next!=null)current=current.next;
    		else current=null;
    		temp=head_output;
    		
    		
    	}
    	
    	Node current1=head_output;
    	current=head;
    	
    	while(current!=null){
    		if(current.data!=current1.data)return false;
    		if(current.next!=null){current=current.next; current1=current1.next;}
    		else current=null;	
    	}
    	
    	
	
		return true;
        
    }

	public static void main(String[] args) {
		LinkedL test= new LinkedL();
		test.append(1);
		test.append(2);
		test.append(2);
		test.append(1);


		
		System.out.println(isPalindrome(test.Head));

	}

}
