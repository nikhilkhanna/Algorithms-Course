package sorting;

public class RadixSort 
{
	
	/** Sorts an array of characters via key index counting
	 * @param characters	array of lowercase alphabet to be sorted (R = 26)
	 */
	public static void alphabetSorter(char[] characters)
	{
		final int R = 26;
		int[] count = new int[R+1];
		char[] aux = new char[characters.length];
		//filling count array with the numbers of each character
		for(int i = 0; i < characters.length; i++)
		{
			count[charToIndex(characters[i])+1]++;
		}
		//summing the array to get the indicies of each character
		for(int i = 0; i < R; i++)
		{
			count[i+1]+=count[i];
		}
		//going through the array and putting each character in appropriate index in aux
		for(int i = 0; i < characters.length; i++)
		{
			aux[count[charToIndex(characters[i])]++] = characters[i];
		}
		//copying data back
		for(int i = 0; i < aux.length; i++)
		{
			characters[i] = aux[i];
		}
	}
	private static int charToIndex(char a)
	{
		return a-97;
	}
}
