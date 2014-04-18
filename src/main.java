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
//@author Nikhil Khanna
//Client for testing classes
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST<Integer, String> binaryTree = new BST<Integer, String>();
		binaryTree.put(5, "hello");
		binaryTree.put(1, "bye");
		binaryTree.put(7, "end");
		binaryTree.put(0, "goodbye");
		binaryTree.delete(0);
		System.out.println(binaryTree.size());
		for(Integer i : binaryTree.keys())
		{
			System.out.println(i);
		}
	}
}
