package chapter4;

public class TreeNode {

	Integer Data;
	TreeNode left,right;
	
	public TreeNode(int item){
		this.Data=item;
	}

	
	public void insert(int item){
		if(this.Data==null){ 
			this.Data=item;
			return;
		}
		else if(item<this.Data){
			if(left==null) left=new TreeNode(item);
			else left.insert(item);
		}
		else if(item>this.Data){
			if(right==null) right= new TreeNode(item);
			else right.insert(item);
		
		}	
		
	}
	public boolean contains(int item){
		if(this.Data==item) return true;
		else if(left!=null && item<this.Data) left.contains(item);
		else if(right!=null && item>this.Data) right.contains(item);
		
		return false;
	}
	
	public void InOrderTraversal(){
		if(left!=null) left.InOrderTraversal();
		System.out.println(this.Data);
		if(right!=null)right.InOrderTraversal();
		
	}
	
	public static void main(String[] args){
		TreeNode T = new TreeNode(10);
		T.insert(5);
		T.insert(2);
		T.insert(4);
		T.insert(1);
		T.insert(7);
		T.insert(8);
		T.InOrderTraversal();
		
		System.out.println(T.contains(10));
		System.out.println(T.contains(6));
	}
	
	
}
