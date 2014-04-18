package Misc;

import Helper.Queue;

public class BST<Key extends Comparable<Key>, Value>
{
	private Node root;
	
	private class Node {
		private Key key;
		private Value val;
		private int count;
		private Node left, right;
		public Node(Key k, Value v) {
			this.count = 1;
			this.key = k;
			this.val = v;
		}
	}
	
	public Value get(Key key)
	{
		Node x = root;
		while(x != null)
		{
			int cmp = key.compareTo(x.key);
			if(cmp < 0) x = x.left;
			else if(cmp > 0) x = x.right;
			else return x.val;
		}
		return null;
	}
	
	public void put(Key k, Value v)
	{
		root = put(root, k, v);
	}
	
	private Node put(Node x, Key k, Value v)
	{
		if(x == null)
			return new Node(k, v);
		int cmp = k.compareTo(x.key);
		if(cmp < 0) 
			x.left = put(x.left, k, v);
		else if(cmp > 0) 
			x.right = put(x.right, k, v);
		else
			x.val = v;
		x.count = 1 + size(x.left) + size(x.right);
		return x;
	}
	
	public void delete(Key k)
	{
		delete(root, k);
	}
	
	private Node delete(Node x, Key k)
	{
		if(x == null) return null;
		int cmp = k.compareTo(x.key);
		if (cmp < 0) x.left = delete(x.left, k);
		else if (cmp > 0) x.right = delete(x.right, k);
		else
		{
			if(x.right == null)
				return x.left;
			if(x.left == null)
				return x.right;
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		x.count = size(x.left) + 1 + size(x.right);
		return x;
	}
	
	
	public void deleteMin()
	{
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node x)
	{
		if(x.left == null) return x.right;
		x.left = deleteMin(x.left);
		x.count = 1 + size(x.left)+size(x.right);
		return x;
	}
	
	private Node min(Node x)
	{
		if(x == null) return null;
		if(x.left == null) return x;
		return min(x.left);
	}
	
	public int size()
	{
		return size(root);
	}
	
	private int size(Node x)
	{
		if (x == null) return 0;
		return x.count;
	}
	
	public Iterable<Key> keys()
	{
		Queue<Key> q = new Queue<Key>();
		inorder(root,q);
		return q;
	}
	
	public void inorder(Node x, Queue<Key> q)
	{
		if(x == null) return;
		inorder(x.left, q);
		q.enqueue(x.key);
		inorder(x.right, q);
	}
}
