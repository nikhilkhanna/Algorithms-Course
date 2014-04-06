package Graphs;
import java.util.*;

public class BreadthFirstPaths {
	public boolean[] marked;
	public int[] edgeTo;
	private int s;
	public BreadthFirstPaths(Graph g, int s)
	{
		this.s = s;
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		bfs(g, s);
	}
	public void bfs(Graph g, int s)
	{
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(s);
		marked[s] = true;
		edgeTo[s] = 0;
		while(!q.isEmpty())
		{
			int currentNode = q.remove().intValue();
			for(Integer i : g.adj(currentNode))
			{
				if(!marked[i])
				{
					marked[i] = true;
					edgeTo[i] = currentNode;
					q.add(i);
				}
			}
		}
	}
}
