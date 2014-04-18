package MST_And_Shortest_Path;

public class DirectedEdge {
	private final int v;
	private final int w;
	private final double weight;
	
	public DirectedEdge(int from, int to, double weight)
	{
		this.v = from;
		this.w = to;
		this.weight = weight;
	}
	
	public int from()
	{
		return v;
	}
	
	public int to()
	{
		return w;
	}
	
	public double weight()
	{
		return weight;
	}
	
	public String toString()
	{
		return String.format("%d -> %d", v, w);
	}
}

