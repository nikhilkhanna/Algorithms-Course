package MST_And_Shortest_Path;

//@author Nikhil Khanna
public class Edge implements Comparable<Edge>
{
	private int v;
	private int w;
	private double weight;
	public Edge(int v, int w, double weight)
	{
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	public int either()
	{
		return v;
	}
	public int other(int vertex)
	{
		if(vertex == v)
			return w;
		else
			return v;
	}
	@Override
	public int compareTo(Edge o) {
		if (this.weight<o.weight)
			return -1;
		else if(this.weight>o.weight)
			return 1;
		else
			return 0;
	}
	
	public String toString()
	{
		return String.format("%d -> %d", v, w);
	}
}
