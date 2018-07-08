package chapter4;

public class createMinimalBST {
	
	
	public TreeNode createMinimalBST(int[] array){
		return createMinimalBST(array,0,array.length-1);
	}
	
	private TreeNode createMinimalBST(int[] array,int start,int end){
		if(start<end){
			return null;
		}
		
		int middle = (start + end)/2 ; 
		TreeNode current= new TreeNode(array[middle]);
		
		current.left=createMinimalBST(array, start, middle-1);
		current.right=createMinimalBST(array, middle+1, end);
		
		return current;
		
		
	}

}
