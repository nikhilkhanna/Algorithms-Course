package Misc;

import java.util.LinkedList;

import Graphs.Bag;

public class SeperateChainingHashST<Key, Value>
{
	private int N; // number of key value pairs
	private int M; // hash table size;
	private Object[] st;
	
	private class Node
	{
		private Key key;
		private Value val;
		private Node next;
		public Node(Key k, Value v, Node n)
		{
			key = k;
			val = v;
			next = n;
		}
	}
	
	public SeperateChainingHashST()
	{
		this(997);
	}
	
	public SeperateChainingHashST(int size)
	{
		this.M = size;
		st = new Object[M];
	}
	
	private int hash(Key key)
	{
		return (key.hashCode()&0x7fffffff) % M;
	}
	
	public Value get(Key key)
	{
		int index = hash(key);
		for(Node x = (Node)st[index]; x!= null; x= x.next)
		{
			if(key.equals(x.key)) return x.val;
		}
		return null;
	}
	
	public void put(Key key, Value val)
	{
		if(key == null)
			return;
		int index = hash(key);
		for(Node x = (Node)st[index]; x != null; x = x.next)
		{
			if(key.equals(x.key))
			{	
				x.val = val; return;
			}
		}
		st[index] = new Node(key, val, (Node)st[index]);
		N++;
	}
}
