
class myArrayList 
{
	int[] ar;
	public myArrayList()
	{
		ar = new int[0];
	}
	
	public void clear() 
	{
		ar = new int[0];
	}
	
	public int size()
	{
		return ar.length;
	}
	// Tests null, o , 1, 2 , many
	public void init(int[] ini)
	{
		ar = new int[ini.length];
		for (int i = 0; i < ar.length ; i++)
		{
			ar[i] = ini[i];
		}
		
		//init with null самому решить 
	}
	public int[] toArray()
	{
		int[] outAr = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
		{
			outAr[i] = ar[i];
		}
		return outAr;
	}
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
	public void addEnd(int val)
	{
		int[] buff = ar;
		ar = new int[buff.length+1];
		ar[ar.length-1] = val;
		for (int i = 0; i < ar.length-1 ; i++)
		{
			ar[i] = buff[i];
		} 
	}
	public void addPos(int pos, int val)
	{
		int[] buff = ar;
		ar = new int[buff.length+1];
		ar[pos] = val;
		for (int i = 0; i < ar.length-1 ; i++)
		{
			ar[i] = buff[i];
		} 
	}
	
	}
	
	
	
//	delPos // Значение удаляемого элемента
// addPos - добавлет позицию смещая текущую
// print - выводит в консоль

