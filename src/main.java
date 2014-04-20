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
import Misc.BST;
import Misc.MaxPQ;
import Misc.SeperateChainingHashST;
//@author Nikhil Khanna
//Client for testing classes
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SeperateChainingHashST<Integer, String> st = new SeperateChainingHashST<>(4);
		for(int i = 0; i < 20; i++)
		{
			st.put(i, "hello"+i);
		}
		for(int i = 0; i < 20; i++)
		{
			System.out.println(st.get(i));
		}
	}
}
