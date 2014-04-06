package Graphs;
import java.lang.*;
public class Graph {
	//num vertices
	private final int V;
	private Bag<Integer> [] adj;
	
	public Graph(int v)
	{
		V = v;
		adj = (Bag<Integer>[]) new Bag[V];
		for(int i = 0; i<V;i++)
		{
			adj[i] = new Bag<Integer>();
		}
	}
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}
	int V()
	{
		return V;
	}
	public String toString()
	{
		String s = "";
		for(int i = 0; i<V;i++)
		{
			s+=(""+i+": ");
			for(Integer myInt : adj(i))
			{
				s+=(""+myInt+" ");
			}
			s+="\n";
		}
		return s;
	}
}
