import java.util.Arrays;

import Week2.DijkstraSP;
import Week2.DirectedEdge;
import Week2.Edge;
import Week2.EdgeWeightedDigraph;
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
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(5);
		g.addEdge(new DirectedEdge(0,1,5.0));
		g.addEdge(new DirectedEdge(0, 2, 1.0));
		g.addEdge(new DirectedEdge(2, 1, 2.0));
		g.addEdge(new DirectedEdge(1, 4, .5));
		g.addEdge(new DirectedEdge(2, 3, 5.0));
		g.addEdge(new DirectedEdge(4,3,1.0));
		g.addEdge(new DirectedEdge(3,0,2.0));
		DijkstraSP sp = new DijkstraSP(g, 0);
		for(DirectedEdge e : sp.edgeTo())
		{
			System.out.println(e);
		}
	}
}
