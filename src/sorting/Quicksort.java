package sorting;

import java.util.Random;

public class Quicksort {

	public static void sort(Comparable[] a)
	{
		shuffle(a);
		sort(a, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi)
	{
		if(hi <= lo) return;
		int mid = partion(a, lo, hi);
		sort(a, lo, mid-1);
		sort(a, mid+1, hi);
	}
	
	private static int partion(Comparable[] a, int lo, int hi)
	{
		int i = lo, j = hi+1;
		while(true)
		{
			while(less(a[++i],a[lo]))
				if(i == hi) break;
			
			while(less(a[lo],a[--j]))
				if(j == lo) break;
			
			if(i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	private static void shuffle(Comparable[] a)
	{
		Random r = new Random();
		for(int i = 0; i<a.length;i++)
		{
			exch(a, i, r.nextInt(i+1));
		}
	}
	
	private static boolean less(Comparable v, Comparable w)
	{
		return (v.compareTo(w) < 0);
	}

	private static void exch(Comparable[] a, int i, int j)
	{
	   Comparable swap = a[i];
	   a[i] = a[j];
	   a[j] = swap;
	} 
}
