package Week2;

import Graphs.Bag;

//@author Nikhil Khanna

public class EdgeWeightedGraph {
	private final int V;
	private Bag<Edge> [] adj;
	public EdgeWeightedGraph(int V)
	{
		this.V = V;
		adj = (Bag<Edge>[]) new Bag[V];
		for(int i = 0; i<V;i++)
		{
			adj[i] = new Bag<Edge>();
		}
	}
	
	public void addEdge(Edge e)
	{
		int v = e.either(), w = e.other(v);
		adj[v].add(e);
		adj[w].add(e);
	}
	
	public Iterable<Edge> adj(int v)
	{
		return adj[v];
	}
}
