package sorting;

public class RadixSort 
{
	public static final int R = 256;
	
	
	
	public static void MSDSort(String[] a)
	{
		String[] aux = new String[a.length];
		MSDSort(a, aux, 0, a.length-1,0);
	}
	
	private static void MSDSort(String[] a, String[] aux, int lo, int hi, int d)
	{
		//returns if single word in subsection to be sorted
		if(hi<=lo)	return;
		int count[] = new int[R+2];
		for(int i = lo; i <= hi; i++)
		{
			count[charAt(a[i], d)+2]++;
		}
		for(int r = 0; r < R+1; r++)
		{
			count[r+1] += count[r];
		}
		for(int i = lo; i<= hi; i++)
		{
			aux[count[charAt(a[i], d)+1]++] = a[i];
		}
		for(int i = lo; i<= hi; i++)
		{
			a[i] = aux[i-lo];
		}
		
		for(int r = 0; r<R;r++)
		{
			MSDSort(a, aux, lo+count[r],lo+count[r+1]-1, d+1);
		}
		
	}
	
	private static int charAt(String s, int d)
	{
		if(d<s.length()) return s.charAt(d);
		else return -1;
	}
	/** Sorts an array of same size strings via LSD
	 * @param a		array of strings  to be sorted
	 * @param W 	chars in each string
	 */
	public static void LSDSort(String[] a, int W)
	{
		int N = a.length;
		String[] aux = new String[N];
		for(int d = W-1; d >= 0; d--)
		{
			int[] count = new int[R+1];
			for (int i = 0; i < N; i++)
				count[a[i].charAt(d)+1]++;

			for (int i = 0; i < R; i++)
				count[i+1] += count[i];
			
			for (int i = 0; i < N; i++)
				aux[count[a[i].charAt(d)]++] = a[i];
			
			for (int i = 0; i < N; i++)
				a[i] = aux[i];
			
		}
	}
	
	/** Sorts an array of characters via key index counting
	 * @param characters	array of lowercase alphabet to be sorted
	 */
	public static void alphabetSorter(char[] characters)
	{
		int[] count = new int[R+1];
		char[] aux = new char[characters.length];
		//filling count array with the numbers of each character
		for(int i = 0; i < characters.length; i++)
		{
			count[characters[i]+1]++;
		}
		//summing the array to get the indicies of each character
		for(int i = 0; i < R; i++)
		{
			count[i+1]+=count[i];
		}
		//going through the array and putting each character in appropriate index in aux
		for(int i = 0; i < characters.length; i++)
		{
			aux[count[characters[i]]++] = characters[i];
		}
		//copying data back
		for(int i = 0; i < aux.length; i++)
		{
			characters[i] = aux[i];
		}
	}
}
