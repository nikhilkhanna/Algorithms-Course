import java.util.Arrays;

import Week2.Edge;
import Week2.EdgeWeightedGraph;
import Week2.LazyPrimMST;

import Graphs.BreadthFirstPaths;
import Graphs.CC;
import Graphs.Graph;
//@author Nikhil Khanna
//Client for testing classes
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeWeightedGraph g = new EdgeWeightedGraph(5);
		g.addEdge(new Edge(0, 1, 1.0));
		g.addEdge(new Edge(1, 3, 1.5));
		g.addEdge(new Edge(2, 4, 2.0));
		g.addEdge(new Edge(3, 4, 7.0));
		g.addEdge(new Edge(2, 0, 3.0));
		g.addEdge(new Edge(0, 4, 1.0));
		LazyPrimMST mst = new LazyPrimMST(g);
		for(Edge e : mst.mst())
		{
			System.out.println(e);
		}
	}
}
