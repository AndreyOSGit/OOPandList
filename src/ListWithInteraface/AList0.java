package ListWithInteraface;

public class AList0 implements Elist
{
	
	int[] ar;
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
		int[] buff = new int[size()+1];
		buff[0] = val;
		for (int i = 0; i < ar.length ; i++)
		{
			buff[i+1] = ar[i];
		} 
		ar = buff;

	}

	@Override
	public void addEnd(int val) 
	{

		int[] buff = new int[size()+1];
		buff[size()+1] = val;
		for (int i = 0; i < ar.length ; i++)
		{
			buff[i] = ar[i];
		} 
		ar = buff;

	}

	@Override
	public void addPos(int pos, int val) 
	{
		if (pos < 0 || pos >ar.length-1 ) throw new IllegalArgumentException();

		int[] buff = new int[size() + 1];
		for (int i = 0; i < pos; i++)
		{
			buff[i] = ar[i];
		}
		for (int i = pos; i < size(); i++)
		{
			buff[i + 1] = ar[i];
		}
		buff[pos] = val;
		ar = buff;
	}

	@Override
	public int delStart() {

		if (ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		int val = ar[0];
		int[] buff = new int[ar.length - 1];
		for (int i = 0; i < ar.length - 1; i++)
		{
			buff[i] = ar[i + 1];
		}
		ar = buff;
		return val;
	}

	@Override
	public int delEnd() {

		if (ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		int val = ar[ar.length - 1];
		int[] buff = new int[ar.length - 1];
		for (int i = 0; i < ar.length - 1; i++)
		{
			buff[i] = ar[i];
		}
		ar = buff;
		return val;
	}

	@Override
	public int delPos(int pos) {

		if ((pos > ar.length) || (pos < 0))
		{
			throw new IllegalArgumentException();
		}
		int val = ar[pos];
		int[] buff = new int[ar.length - 1];
		for (int i = 0; i < pos; i++)
		{
			buff[i] = ar[i];
		}
		for (int i = pos; i < ar.length - 1; i++)
		{
			buff[i] = ar[i + 1];
		}
		ar = buff;
		return val;
	}

	@Override
	public int min() {

		int buff = ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (buff > ar[i])
				buff = ar[i];
		}
		return buff;
	}

	@Override
	public int max() {
		int buff = ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (buff < ar[i])
				buff = ar[i];
		}
		return buff;
	}

	@Override
	public int minPos() {
		int buff = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[buff] > ar[i])
				buff = i;
		}
		return buff;
	}

	@Override
	public int maxPos() {
		int buff = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[buff] < ar[i])
				buff = i;
		}
		return buff;
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
			int buff = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = buff;
		}

	}

	@Override
	public void halfRevers() {
		for (int i = 0; i < ar.length / 2; i++)
		{
			int buff = ar[i];
			ar[i] = ar[ar.length - ar.length / 2 + i];
			ar[ar.length - ar.length / 2 + i] = buff;
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

		if (pos < 0 || pos >ar.length-1 ) throw new IllegalArgumentException();
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

//		outString = String.format("[%s]", outString);
		return outString;		
	}

}
