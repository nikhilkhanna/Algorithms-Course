package Graphs;

public class CC {
	public boolean[] marked;
	public int[] id;
	public CC(Graph g)
	{
		marked = new boolean[g.V()];
		id = new int[g.V()];
		int count = 0;
		for(int i = 0; i<g.V();i++)
		{
			if(!marked[i])
			{
				dfs(g,i,count);
				count++;
			}
		}
	}
	private void dfs(Graph g, int v,int count)
	{
		marked[v] = true;
		id[v] = count;
		for(Integer i : g.adj(v))
		{
			if(!marked[i])
			{
				dfs(g, i, count);
			}
		}
	}
	public int id(int v)
	{
		return id[v];
	}
}
