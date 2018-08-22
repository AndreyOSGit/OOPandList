package ListWithInteraface;

public class AList2 implements Elist 
{

	int ar[] = new int[30];
	int start = 15;
	int end = 15;
	@Override
	public void clear() {
		start = ar.length/2;
		end = ar.length/2;
	}
	@Override
	public void init(int[] ini) {
		if ( ini == null ) ini = new int[0];
		start = ar.length/2;

		for (int i = 0; i < ini.length; i++)
		{
			ar[start + i] = ini[i];
		}
		end = start + ini.length;

	}
	@Override
	public int[] toArray() {
		int[] ret = new int[size()];
		for (int i = start; i < end; i++)
		{
			ret[i - start] = ar[i];
		}
		return ret;
	}
	@Override
	public int size() 
	{
		return end-start;
	}
	@Override
	public void addStart(int val) {
		ar[--start] = val;

	}
	@Override
	public void addEnd(int val) {
		ar[end++] = val;

	}
	@Override
	public void addPos(int pos, int val) {

		if ((pos > end - start) || (pos < 0))
		{
			throw new IllegalArgumentException();
		}
		for (int i = end; i > start + pos; i--)
		{
			ar[i] = ar[i - 1];
		}
		end++;
		ar[start + pos] = val;

	}
	@Override
	public int delStart() {
		if (start == end)
		{
			throw new IllegalArgumentException();
		}
		start++;
		return ar[start - 1];
	}
	@Override
	public int delEnd() {
		end--;
		return ar[end];
	}
	@Override
	public int delPos(int pos) {
		if (start == end)
		{
			throw new IllegalArgumentException();
		}
		end--;
		return ar[end];
	}
	@Override
	public int min() {

		int buff = start;
		for (int i = start+1; i < end; i++)
		{
			if (ar[buff] > ar[i])
				buff = i;
		}
		return buff - start;
	}
	@Override
	public int max() {

		int buff = start;
		for (int i = start+1; i < end; i++)
		{
			if (ar[buff] < ar[i])
				buff = i;
		}
		return buff - start;
	}
	@Override
	public int minPos() {
		int buff = start;
		for (int i = start+1; i < end; i++)
		{
			if (ar[buff] > ar[i])
				buff = i;
		}
		return buff - start;
	}
	@Override
	public int maxPos() {
		int buff = start;
		for (int i = start+1; i < end; i++)
		{
			if (ar[buff] < ar[i])
				buff = i;
		}
		return buff - start;
	}
	@Override
	public void sort() {
		for (int i = start+1; i < end; i++)
		{
			int j;
			int temp = ar[i];
			for (j = i - 1; j >= start; j--)
			{
				if (ar[j] < temp)
					break;
				ar[j + 1] = ar[j];
			}
			ar[j + 1] = temp;
		}

	}
	@Override
	public void revers() {
		for (int i = start; i < start + (size()) / 2; i++)
		{
			int tmp = ar[i];
			ar[i] = ar[end - i + start - 1];
			ar[end - i + start - 1] = tmp;
		}
	}
	@Override
	public void halfRevers() {
		for (int i = start; i < start + (size()) / 2; i++)
		{
			int buff = ar[i];
			ar[i] = ar[end - (size()) / 2 + i - start];
			ar[end - (end - size()) / 2 + i - start] = buff;
		}

	}
	@Override
	public int get(int pos) {

		return ar[pos + start];
	}
	@Override
	public void set(int pos, int val) {

		ar[pos+start] = val;

	}
	//есть реализация где при инициализации от центар выбирают чет и не чет 

	@Override
	public String toString() 
	{

		String outString = "";
		for (int i = 0; i < ar.length; i++) 
		{
			outString += String.format("%d, ", ar[i]);
		}

		outString = String.format("[%s]", outString);
		return outString;


	}

}
