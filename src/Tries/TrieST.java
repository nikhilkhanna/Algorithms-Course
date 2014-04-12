package Tries;

public class TrieST<Value>
{
	//ascii is radix
	private static final int R = 256;
	private Node root = new Node();
	
	private static class Node 
	{
		private Object value;
		private Node[] next = new Node[R];
	}
	
	public void put(String key, Value val)
	{
		root = put(root, key, val, 0);
	}
	
	private Node put(Node x, String key, Value val, int d)
	{
		if (x==null)
			x = new Node();
		if (d == key.length()) { x.value = val; return x;}
		char c = key.charAt(d);
		x.next[c] = put(x.next[c], key, val, d+1);
		return x;
	}
	
	public Value get(String key)
	{ return get(root, key, 0); }
	
	public boolean contains(String key) 
	{ return get(key) != null; }
	
	private Value get(Node x, String key, int d)
	{
		if(x==null)
			return null;
		if (d == key.length()) {return (Value)x.value;}
		char c = key.charAt(d);
		return get(x.next[c], key, d+1);
	}
	
	public void delete(String key)
	{ 
		if (!contains(key))
			return;
		delete(root, key, 0);
	}
	
	private void delete(Node x, String key, int d)
	{
		if (d == key.length())
		{
			x.value = null;
			return;
		}
		char c = key.charAt(d);
		delete(x.next[c], key, d+1);
		boolean hasNoLinks = true;;
		for(int i = 0; i<x.next[c].next.length;i++)
		{
			if(x.next[c].next[i]!=null)
			{
				hasNoLinks = false;
			}
		}
		if(x.next[c].value==null && hasNoLinks)
			x.next[c] = null;
	}
}
