import java.util.Arrays;

import sorting.Mergesort;

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
		Integer[] myNums = {3,6,7,2,6,7,3,63,634,61234,61423,5,0,12,-5,6,21,6789234};
		Mergesort.sort(myNums);
		for(Integer i : myNums)
			System.out.printf("%d ",i.intValue());
	}
}
