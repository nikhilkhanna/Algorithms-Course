import java.util.Arrays;

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
		Graph g = new Graph(8);
		g.addEdge(0, 1);
		g.addEdge(3, 1);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.addEdge(7, 6);
		g.addEdge(6, 5);
		CC c = new CC(g);
		System.out.println(c.id(0));
		System.out.println(c.id(7));
	}
}
