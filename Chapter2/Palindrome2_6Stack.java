package Chapter2;

import java.util.Stack;

public class Palindrome2_6Stack {

	 public static boolean isPalindromeStack(Node head){
		 
		 Node slow = head;
		 Node fast = head;
		 Stack<Integer> s=new Stack<Integer>();
		 while(fast!=null && fast.next!=null){
			 s.push(slow.data);
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 
		 if(fast!=null){
			 slow=slow.next;
		 }
		 
		 while(slow!=null){
			 
			 int top=s.pop();
			 if(top!=slow.data){
				 return false;
			 }
			 slow=slow.next;
		 }
		 
		 
		 
		 return true;
		 
	 }
	
	
	public static void main(String[] args) {
		LinkedL test= new LinkedL();
		test.append(1);
		test.append(2);
		test.append(3);
		test.append(2);
		test.append(1);


		
		System.out.println(isPalindromeStack(test.Head));
	}

}
