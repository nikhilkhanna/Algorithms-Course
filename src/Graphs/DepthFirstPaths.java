package Graphs;

public class DepthFirstPaths {
	//if we have touched this yet
	public boolean[] marked;
	public int[] edgeTo;
	//initial vertex
	private int s;
	public DepthFirstPaths(Graph g, int s)
	{
		this.s = s;
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		dfs(g,s);
	}
	
	public void dfs(Graph g, int v)
	{
		marked[v] = true;
		for(Integer i : g.adj(v))
		{
			if(!marked[i])
			{
				dfs(g,i);
				edgeTo[i] = v;
			}
		}
	}
}
