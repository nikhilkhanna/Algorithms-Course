package MST_And_Shortest_Path;

import Helper.IndexMinPQ;

public class DijkstraSP
{
	private DirectedEdge[] edgeTo;
	private double[] distTo;
	IndexMinPQ<Double> pq;
	
	public DijkstraSP(EdgeWeightedDigraph g, int s)
	{
		edgeTo = new DirectedEdge[g.V()];
		distTo = new double[g.V()];
		pq = new IndexMinPQ<Double>(g.V());
		
		for(int i = 0; i<g.V();i++)
		{
			distTo[i] = Double.POSITIVE_INFINITY;
		}
		distTo[s] = 0;
		pq.insert(s, distTo[s]);
		while(!pq.isEmpty())
		{
			int v = pq.delMin();
			for(DirectedEdge e : g.adj(v))
			{
				relax(e);
			}
		}
	}
	
	public void relax(DirectedEdge e)
	{
		int v = e.from(), w = e.to();
		if(distTo[w]>distTo[v]+e.weight())
		{
			distTo[w] = distTo[v]+e.weight();
			edgeTo[w] = e;
			if(pq.contains(w)) pq.decreaseKey(w, distTo[w]);
			else			   pq.insert(w, distTo[w]);
		}
	}
	public DirectedEdge[] edgeTo()
	{
		return edgeTo;
	}
}
