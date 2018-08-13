package ListWithInteraface;

public class AList2 implements Elist 
	{
	
	int ar[];
	int start = ar.length/2;
	int end = ar.length-1;
	@Override
	public void clear() {
		start = ar.length/2;
		end = ar.length/2;
	}
	@Override
	public void init(int[] ini) {
		if ( ini == null ) ini = new int[0];
		int h = ini.length/2;
		
		clear();
		
		
//		int size = ini.length;
//		start -= size/2;
//		end = start = size;
//		for (int i = 0; i < size; i++) 
//		{
//			ar[start + i] = ini[i];
//		}
		
	}
	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() 
	{
		return end-start;
	}
	@Override
	public void addStart(int val) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addEnd(int val) {
		ar[end++] = val;
		
	}
	@Override
	public void addPos(int pos, int val) {
		// TODO Auto-generated method stub
		
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
	public int get(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void set(int pos, int val) {
		// TODO Auto-generated method stub
		
	}
		//есть реализация где при инициализации от центар выбирают чет и не чет 
	
	
	}
