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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delEnd() {
		
//		int[] buff = ar;
//		ar = new int[buff.length+1];
//		ar[pos] = val;
//		for (int i = 0; i < ar.length-1 ; i++)
//		{
//			ar[i] = buff[i];
//		}
//}
		return 1;
	}

	@Override
	public int delPos(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int min() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void halfRevers() {
	
		
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
		
	}

	@Override // нудна чтоы при переопределении метода мы не ошиблись в сигнатуре
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
