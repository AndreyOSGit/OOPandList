package ListWithInteraface;

public class LList implements Elist
{
	
	private Node root = null;

	@Override
	public void clear() 
	{
		root = null;		
	}

	@Override
	public void init(int[] ini) 
	{
		if (root == null) { addStart(ini[0]); }
		else 
		{
			int i = 0;
			Node tmp = root;
			while(tmp.next != null)
			{
				tmp.next = new Node(ini[i]);
				tmp = tmp.next;
		    }

		}
	}

	@Override
	public int[] toArray() 
	{
		Node tmp = root;
		int[] outArray = new int[size()];
		for (int i = 0; i < outArray.length; i++) 
		{
			outArray[i] = tmp.val;
			tmp = tmp.next;
		}
		return outArray;
	}

	@Override
	public int size() 
	{
		int outSize = 0;
		Node tmp = root;		
		while(tmp.next != null)
		{
		 outSize++;
		}
		return outSize;
	}

	@Override
	public void addStart(int val) 
	{
		
	}

	@Override
	public void addEnd(int val) {
		
		if (root == null) addStart(val)  
		else
		{
				Node tmp = root;
				while(tmp.next != null)
				{
					tmp = tmp.next;
				}
				tmp.next = new Node(val);
		}
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
	

	
}
