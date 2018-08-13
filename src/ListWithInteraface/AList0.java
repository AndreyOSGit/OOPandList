package ListWithInteraface;

public class AList0 implements Elist
{
	
	int[] ar;
	int index = ar.length;
	public AList0() 
	{
		ar = new int[0];
	}

	@Override
	public void clear() 
	{
		
	}

	@Override
	public void init(int[] ini) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addStart(int val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEnd(int val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPos(int pos, int val) 
	{
		if (pos < 0 || pos >index-1 ) throw new IllegalArgumentException();
	}

	@Override
	public int delStart() {
		// TODO Auto-generated method stub
		return 0;
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
	public int get(int pos) 
	{
		if (pos < 0 || pos >index-1 ) throw new IllegalArgumentException();
		return 0;
	}

	@Override
	public void set(int pos, int val) {
		
		if (pos < 0 || pos >index-1 ) throw new IllegalArgumentException();
		
	}

	@Override // нудна чтоы при переопределении метода мы не ошиблись в сигнатуре
	public String toString() 
	{
		String outString = "";
		for (int i = 0; i < index; i++) 
		{
			outString += String.valueOf(ar[i]);	
		}
		return outString;		
	}

}
