
package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TestBFSDemo1 {

	public static void bfs(int start, ArrayList<ArrayList<Integer>> graph) {
		boolean[] visited=new boolean[graph.size()];// false false false false false
		
		Queue<Integer> queue=new LinkedList<>();
		
		visited[start]=true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int node=queue.poll();
			System.out.println(node + " ");
			
			for(int neighbor :graph.get(node)) {
				if(!visited[neighbor]) {
					visited[neighbor]=true;
					queue.add(neighbor);
					
				}
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int v=5;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			graph.add(new ArrayList<>());
			
		}
		graph.get(0).add(1);
		graph.get(0).add(3);
		graph.get(0).add(4);
		graph.get(0).add(2);

		bfs(0,graph);
		

	}

}
