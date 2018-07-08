package chapter4;

import java.util.LinkedList;

public class RouteBetweenTwoNodes4_1 {

	public boolean search(Graph g, Node start, Node end){
		
		if(start.equals(end)){
			return true;
		}
		
		if(start==null || end==null){
			return false;
		}
		
		for(Node e:g.nodes){
			e.State=state.Unvisited;
		}
		
		LinkedList<Node> Que = new LinkedList<Node>();
		start.State=state.Visited;
		Que.add(start);
		
		while(!Que.isEmpty()){
			Node current=Que.poll();
			if(current.Children.length>0){
				for(Node e:current.Children){
					if(e.State==state.Unvisited){
						if(e.equals(end)){
							return true;
						}
						e.State=state.Visited;
						Que.add(e);
					}
				
				}
			}
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		

	}

}
