package ListWithInteraface;

public class AList1 implements Elist
{
	private int index = 0;
	int ar[];
	
	public AList1()
	{
		ar = new int[15];
	}
//	public AList1(int initSize)
//	{
//		ar = new int[initSize];
//	}
	@Override
	public void clear() 
	{
		ar = new int[0];
	}

	@Override
	public void init(int[] ini) {
		if ( ini == null ) ini = new int[0];
		
		for(int i =0; i< ini.length; i++)
		{
			addEnd(ini[i]);
		}
		index = ini.length;
	}

	@Override
	public int[] toArray() 
	{
		int[] outArr = new int[size()];
		for (int i = 0; i < outArr.length; i++) {
			outArr[i] = ar[i];
		}
		return outArr;
	}

	@Override
	public int size() 
	{
		return ar.length;
	}

	@Override
	public void addStart(int val) 
	{
		int[] buffAr = new int[size()+1];
		
		buffAr[0] = val;
		for (int i = 0; i < buffAr.length; i++)
		{
			buffAr[i+1] = ar[i];
		}
		ar = buffAr;
	}

	@Override
	public void addEnd(int val)
	{
		ar[index++] = val;
	}

	@Override
	public void addPos(int pos, int val) {
		if (pos < 0 || pos > index-1 ) throw new IllegalArgumentException();
		
	}

	@Override
	public int delStart()
	{	
		int[] buffAr = new int[ar.length+1];
		
		for (int i = 0; i < buffAr.length; i++)
		{
			buffAr[i=1] = ar[i];
		}
		ar = buffAr;
		return ;
	}

	@Override
	public int delEnd() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(int pos, int val) {
		if (pos < 0 || pos >index-1 ) throw new IllegalArgumentException();
		
	}

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
