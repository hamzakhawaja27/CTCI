package chapter2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDups2_1 {

	public static LinkedList<Integer> RemoveDuplicate(LinkedList<Integer> Inputlist){
		
		
		
		for (int i=0;i<Inputlist.size();i++){
			for (int j=i+1;j<Inputlist.size();j++){
				if(Inputlist.get(i)==Inputlist.get(j)){
					Inputlist.remove(j);
				}
			}
		}
		return Inputlist;
	}
	
	public static LinkedList<Integer> RemoveDuplicateHash(LinkedList<Integer> Inputlist){
		HashSet<Integer> Uniqueset = new HashSet<Integer>();
		for(int i=0;i<Inputlist.size();i++){
			if(Uniqueset.contains(Inputlist.get(i))){
				Inputlist.remove(i);
				i--;
			}
			Uniqueset.add(Inputlist.get(i));
		}
		return Inputlist;
	}
	
	public static void main(String[] args){
		
		LinkedList<Integer> Input= new LinkedList<Integer>();
		
		Input.add(10);
		Input.add(1);
		Input.add(10);
		Input.add(2);
		Input.add(2);
		Input.add(10);
		Input.add(20);
		
		LinkedList<Integer> output=RemoveDuplicate(Input);
		
		for(int i=0;i<output.size();i++){
			System.out.println(output.get(i));
		}
		
	}
	
	
	
}
