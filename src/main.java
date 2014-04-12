import java.util.Arrays;
import java.util.Random;

import sorting.ElementarySorts;
import sorting.Mergesort;
import sorting.Quicksort;
import sorting.RadixSort;

import Tries.TST;
import Tries.TrieST;
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
		TST<Integer> myTrie = new TST<Integer>();
		myTrie.put("hi", 1);
		myTrie.put("bye", 5);
		System.out.println(myTrie.get("bye"));
	}
}
