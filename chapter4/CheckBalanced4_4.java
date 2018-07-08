package chapter4;

public class CheckBalanced4_4 {
	
	
	public static Integer Treeheight(TreeNode root){
		if(root==null) return -1;
		
		return 1 + Math.max(Treeheight(root.left),Treeheight(root.right));
	}
	
	public static boolean is_balanced(TreeNode root){ 
		if(root==null) return true;
		if (Math.abs(Treeheight(root.left)-Treeheight(root.right))>1){
			return false;
		}
		return is_balanced(root.left) && is_balanced(root.right); 
	}
	
	
	public static Integer checkheight(TreeNode root){		
		if(root==null) return -1;

		int left=checkheight(root.left);
		if(left==Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int right=checkheight(root.right);
		if(right==Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int diff=Math.abs(left-right);
		if(diff>1) return Integer.MIN_VALUE;
		else return Math.max(left, right) + 1;
		
	}
	
	
	
	public static void main(String[] args){
		
		TreeNode s=new TreeNode(1);
		TreeNode current=new TreeNode(2);
		TreeNode current1=new TreeNode(2);
		TreeNode current2=new TreeNode(3);
		TreeNode current3=new TreeNode(3);
		TreeNode current4=new TreeNode(4);
		TreeNode current5=new TreeNode(4);
		s.left=current;
		s.right=current1;
		s.left.left=current2;
		s.left.right=current3;
		s.left.left.left=current4;
		s.left.left.right=current5;
		System.out.println(is_balanced(s));
		
	}

}
