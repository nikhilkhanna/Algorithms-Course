import java.util.Arrays;
import java.util.Random;

import sorting.ElementarySorts;
import sorting.Mergesort;
import sorting.Quicksort;
import sorting.RadixSort;

import Tries.TST;
import Tries.TrieST;

import Graphs.BreadthFirstPaths;
import Graphs.CC;
import Graphs.Graph;
import MST_And_Shortest_Path.DijkstraSP;
import MST_And_Shortest_Path.DirectedEdge;
import MST_And_Shortest_Path.Edge;
import MST_And_Shortest_Path.EdgeWeightedDigraph;
import MST_And_Shortest_Path.EdgeWeightedGraph;
import MST_And_Shortest_Path.LazyPrimMST;
import Misc.MaxPQ;
//@author Nikhil Khanna
//Client for testing classes
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxPQ<Integer> pq = new MaxPQ<Integer>(5);
		pq.insert(5);
		pq.insert(3);
		pq.insert(2);
		pq.insert(7);
		pq.insert(1);
		while(!pq.isEmpty())
			System.out.println(pq.delMax());
	}
}
