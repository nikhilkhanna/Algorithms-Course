package Misc;

public class MaxPQ <Key extends Comparable<Key>>
{
	private Key[] pq;
	private int N;
	public MaxPQ(int capacity)
	{
		pq = (Key[])new Comparable[capacity+1];
	}
	public boolean isEmpty()
	{
		return N==0;
	}
	
	public void insert(Key k)
	{
		pq[++N] = k;
		swim(N);
	}
	public Key delMax()
	{
		Key temp = pq[1];
		exch(1, N--);
		sink(1);
		pq[N+1] = null;
		return temp;
	}
	//moves tree up to level of incompetence
	private void swim(int k)
	{
		while(k > 1&& less(k/2,k))
		{
			exch(k, k/2);
			k = k/2;
		}
	}
	private void sink(int k)
	{
		while(2*k<=N)
		{	
			int j = 2*k;
			if(j<N && less(j, j+1))
				j++;
			if(!less(k,j))
				break;
			exch(k,j);
			k = j;
		}
	}
	private boolean less(int x, int y)
	{
		return (pq[x].compareTo(pq[y]) < 0);
	}
	private void exch(int i, int j)
	{
	   Key swap = pq[i];
	   pq[i] = pq[j];
	   pq[j] = swap;
	} 
}
