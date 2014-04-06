package Week2;

import Graphs.Bag;

public class EdgeWeightedDigraph {
	private final int V;
	private Bag<DirectedEdge> [] adj;
	public EdgeWeightedDigraph(int V)
	{
		this.V = V;
		adj = (Bag<DirectedEdge>[]) new Bag[V];
		for(int i = 0; i<V;i++)
		{
			adj[i] = new Bag<DirectedEdge>();
		}
	}
	
	public void addEdge(DirectedEdge e)
	{
		int v = e.from();
		adj[v].add(e);
	}
	
	public int V()
	{
		return V;
	}
	
	public Iterable<DirectedEdge> adj(int v)
	{
		return adj[v];
	}
}
