package chapter2;

public class KLastElement {

	
	public static Integer FindKLastElement(LinkedL Input, int k){
		
		Node LagPointer = null;
		Node LeadPointer = Input.Head;
		int count=1;
		while(LeadPointer.next!=null){
			if(count>k){
				LagPointer=LagPointer.next;
			}
			if(count==k){
				LagPointer=Input.Head;
			}
			LeadPointer=LeadPointer.next;
			count++;
		}
		return LagPointer.data; 
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedL test= new LinkedL();
		test.append(1);
		test.append(2);
		test.append(3);
		test.append(4);
		test.append(5);
		test.append(6);
		test.append(7);
		test.append(8);
		test.append(9);
		test.append(10);
		
		System.out.println(FindKLastElement(test, 7));
		

	}

}
