package Chapter2;

public class SumList2_5 {

	
	public static Node Sum(Node firstinput,Node secondinput){
		int carry=0;
		int sum=0;
		Node Head=null;
		while (firstinput!=null || secondinput!=null){
			sum=carry + firstinput.data + secondinput.data;
			if(sum>9){
				carry=(int) sum/10;
				sum=sum%10;
			}
			else{
				carry=0;
			}
			if(Head==null){
				Head=new Node(sum);
			}
			else{
			Node current=Head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=new Node(sum);
			}
			if(firstinput.next!=null && secondinput.next!=null){
			firstinput=firstinput.next;
			secondinput=secondinput.next;
			}
			else if (firstinput.next!=null && secondinput.next==null) {
				firstinput=firstinput.next;
				secondinput=new Node(0);
			}
			else if(firstinput.next==null && secondinput.next!=null){
				firstinput=new Node(0);
				secondinput=secondinput.next;
			}
			else{
				firstinput=null;
				secondinput=null;
			}
		
		}
		if(carry>0){
			Node current=Head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=new Node(carry);
		}
			
		return Head;
	}
	
	public static void main(String[] args) {
		LinkedL test1= new LinkedL();
		LinkedL test2= new LinkedL();
		test1.append(9);
		test1.append(9);
		test1.append(9);
		
		test2.append(8);
		test2.append(8);
		test2.append(8);
		
		Node out=Sum(test1.Head,test2.Head);
		
	
		while(out!=null){
		System.out.println(out.data);
		out=out.next;
		}
		
	}

}
