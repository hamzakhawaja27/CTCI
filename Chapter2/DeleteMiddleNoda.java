package chapter2;

public class DeleteMiddleNoda {
	
	
	public static void DeleteMiddle(Node Middle){
//		System.out.println(Middle.data);
		while(Middle.next.next!=null){

			Middle.data=Middle.next.data;
//			System.out.println(Middle.data);	
			Middle=Middle.next;
//			System.out.println(Middle.data);
		
			
		}
		Middle.data=Middle.next.data;
		Middle.next=null;
		
		
		
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

			
		DeleteMiddle(test.Head.next.next.next.next);
		
		Node x=test.Head;
		while(x!=null){
		System.out.println(x.data);
		x=x.next;
		}

	}

}
