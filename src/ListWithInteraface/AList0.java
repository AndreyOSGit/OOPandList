package ListWithInteraface;

public class AList0 implements Elist
{
	
	int[] ar;
	int index = 0;
	public AList0() 
	{
		ar = new int[0];
		
	}

	@Override
	public void clear() 
	{
		ar = new int[0];
	}

	@Override
	public void init(int[] ini) {

		if (ini == null | ini.equals(new int[] {})) {throw new IllegalArgumentException("AAA"); }
		index = ini.length;
		ar = new int[ini.length];
		for (int i = 0; i < ar.length ; i++)
		{
			ar[i] = ini[i];
		}

	}

	@Override
	public int[] toArray() {
		int[] outAr = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
		{
			outAr[i] = ar[i];
		}
		return outAr;
	}

	@Override
	public int size() {

		return ar.length;
	}

	@Override
	public void addStart(int val) 
	{
		int[] buff = ar;
		ar = new int[buff.length+1];
		ar[0] = val;
		for (int i = 1; i < ar.length ; i++)
		{
			ar[i] = buff[i];
		} 

	}

	@Override
	public void addEnd(int val) 
	{

		int[] buff = ar;
		ar = new int[buff.length+1];
		ar[ar.length-1] = val;
		for (int i = 0; i < ar.length ; i++)
		{
			ar[i] = buff[i];
		} 

	}

	@Override
	public void addPos(int pos, int val) 
	{
		if (pos < 0 || pos >index-1 ) throw new IllegalArgumentException();

		int[] buff = ar;
		ar = new int[buff.length+1];
		ar[pos] = val;
		for (int i = 0; i < ar.length-1 ; i++)
		{
			ar[i] = buff[i];
		}
	}

	@Override
	public int delStart() {

		if (ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		int val = ar[0];
		int[] tmp = new int[ar.length - 1];
		for (int i = 0; i < ar.length - 1; i++)
		{
			tmp[i] = ar[i + 1];
		}
		ar = tmp;
		return val;
	}

	@Override
	public int delEnd() {

		if (ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		int val = ar[ar.length - 1];
		int[] tmp = new int[ar.length - 1];
		for (int i = 0; i < ar.length - 1; i++)
		{
			tmp[i] = ar[i];
		}
		ar = tmp;
		return val;
	}

	@Override
	public int delPos(int pos) {

		if ((pos > ar.length) || (pos < 0))
		{
			throw new IllegalArgumentException();
		}
		int val = ar[pos];
		int[] tmp = new int[ar.length - 1];
		for (int i = 0; i < pos; i++)
		{
			tmp[i] = ar[i];
		}
		for (int i = pos; i < ar.length - 1; i++)
		{
			tmp[i] = ar[i + 1];
		}
		ar = tmp;
		return val;
	}

	@Override
	public int min() {

		int tmp = ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (tmp > ar[i])
				tmp = ar[i];
		}
		return tmp;
	}

	@Override
	public int max() {
		int tmp = ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (tmp < ar[i])
				tmp = ar[i];
		}
		return tmp;
	}

	@Override
	public int minPos() {
		int tmp = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[tmp] > ar[i])
				tmp = i;
		}
		return tmp;
	}

	@Override
	public int maxPos() {
		int tmp = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[tmp] < ar[i])
				tmp = i;
		}
		return tmp;
	}

	@Override
	public void sort() {
		for (int i = 1; i < ar.length; i++)
		{
			int j;
			int temp = ar[i];
			for (j = i - 1; j >= 0; j--)
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
		for (int i = 0; i < ar.length / 2; i++)
		{
			int tmp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = tmp;
		}

	}

	@Override
	public void halfRevers() {
		for (int i = 0; i < ar.length / 2; i++)
		{
			int tmp = ar[i];
			ar[i] = ar[ar.length - ar.length / 2 + i];
			ar[ar.length - ar.length / 2 + i] = tmp;
		}

	}

	@Override
	public int get(int pos) 
	{
		if (pos < 0 || pos >ar.length-1 ) throw new IllegalArgumentException();
		return ar[pos];
	}

	@Override
	public void set(int pos, int val) {

		if (pos < 0 || pos >index-1 ) throw new IllegalArgumentException();
		ar[pos] = val;
	}

	@Override // нудна чтобы при переопределении метода мы не ошиблись в сигнатуре
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
