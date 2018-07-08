package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepth4_3 {
	
	private void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
		LinkedList<TreeNode> list;
		if(lists.size()<=level){
			list = new LinkedList<TreeNode>();
			lists.add(list);
		}
		else{
			list=lists.get(level);
		}
		
		list.add(root);
		level=level+1;
		createLevelLinkedList(root.left,lists,level);
		createLevelLinkedList(root.right,lists,level);
		
	}
	
	public ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}
	
}
