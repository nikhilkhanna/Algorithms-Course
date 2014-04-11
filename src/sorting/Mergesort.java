package sorting;

public class Mergesort 
{
	public static void sort(Comparable[] a) 
	{
		Comparable[] aux = new Comparable[a.length]; 
		sort(a, aux, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
	{
		if(hi<=lo)
			return;
		int mid = lo + (hi-lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	//low and hi are inclusive endpoints
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	{
		for(int i = lo; i <= hi; i++)
			aux[i] = a[i];
		
		int j = lo;
		int k = mid+1;
		for(int i = lo; i <= hi; i++)
		{
			if(j>mid)
			{
				a[i]= aux[k++];
			}
			else if(k > hi)
			{
				a[i] = aux[j++];
			}
			else if(less(aux[k], aux[j]))
			{
				a[i]= aux[k++];
			}
			else
			{
				a[i] = aux[j++];
			}
		}
		
	}
	
	private static boolean less(Comparable v, Comparable w)
	{
		return (v.compareTo(w) < 0);
	}
}
