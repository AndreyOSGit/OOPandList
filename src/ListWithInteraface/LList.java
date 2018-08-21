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
							
				if (ini == null)
	            {
	                ini = new int[0];
	            }
	            root = null;
	            for (int i = ini.length - 1; i >= 0; i--)
	            {
	                addStart(ini[i]);
	            }
			
	}

	@Override
	public int[] toArray() 
	{
		Node tmp = root;
		int[] outArray = new int[size()];
		int i = 0;
		while (tmp != null)
		{
			outArray[i] = tmp.val;
			tmp = tmp.next;
		}
		return outArray;
	}

	@Override
	public int size() 
	{
		Node tmp = root;
		int outSize = 0;
		if (root == null) { outSize = 0;} else
		{
			while(tmp != null)
			{
			 outSize++;
			tmp = tmp.next;
			}
		}
		return outSize;
	}

	@Override
	public void addStart(int val) 
	{
		  Node p = new Node(val);
          p.next = root;
          root = p;
	}

	@Override
	public void addEnd(int val) {
		
		if (root == null) addStart(val);  
		else
		{
				Node tmp = root;
				Node p = new Node(val);
				while(tmp.next != null)
				{
					tmp = tmp.next;
				}
				tmp.next = p;
		}
	}

	@Override
	public void addPos(int pos, int val) {
		
	
		if (pos < 0 || pos > size())
        {
            throw new IllegalArgumentException();
        }
        if (pos == 0)
            addStart(val);
        else
        {
            Node p = new Node(val);
            Node tmp = root;
            for (int i = 0; i < pos-1; i++)
            {
                tmp = tmp.next;
            }
            p.next = tmp.next;
            tmp.next = p;
        }
	}

	@Override
	public int delStart() {
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        int p = root.val;
        root = root.next;
        return p;
	}

	@Override
	public int delEnd() {
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        int p = 0;
        if (root.next == null)
        {
            p = root.val;
           // root = root.next;
            root = null;
        }
        else
        {
            Node tmp = root;

            while (tmp.next.next != null)
            {
                tmp = tmp.next;
            }
            p = tmp.next.val;
            tmp.next = null;      
        }
        	return p;
	}

	@Override
	public int delPos(int pos) {

		if (root == null)
		{
			throw new IllegalArgumentException();
		}
		if ((pos < 0) || (pos > size()))
		{
			throw new IllegalArgumentException();
		}
		int p = 0;
		if (pos == 0)
		{
			p = root.val;
			root = root.next;
		}
		else
		{
			Node tmp = root;
			for (int i = 0; i < pos - 1; i++)
			{
				tmp = tmp.next;
			}
			p = tmp.next.val;
			tmp.next = tmp.next.next;
		}
		return p;
	}

	@Override
	public int min() {
		
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        Node tmp = root;
        int ret = root.val;
        while (tmp != null)
        {
            if (ret > tmp.val)
                ret = tmp.val;
            tmp = tmp.next;
        }
return ret;
	}

	@Override
	public int max() {
		
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        Node tmp = root;
        int ret = root.val;
        while (tmp != null)
        {
            if (ret < tmp.val)
                ret = tmp.val;
            tmp = tmp.next;
        }
return ret;
	}

	@Override
	public int minPos() {
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        Node tmp = root;
        int min = root.val;
        int i = 0;
        int M = min();
        while (tmp.val != M)
        {
            tmp = tmp.next;
            i++;
        }
return i;
	}

	@Override
	public int maxPos() {
		
		 if (root == null)
         {
             throw new IllegalArgumentException();
         }
         Node tmp = root;
         int max = root.val;
         int i = 0;
         int M = max();
         while (tmp.val != M)
         {
             tmp = tmp.next;
             i++;
         }
return i;
	}

	@Override
	public void sort() {

		 Node tmp;
         Node tmp2;
         for (tmp = root; tmp != null; tmp = tmp.next)
         {
             for (tmp2 = root; tmp2.next != null; tmp2 = tmp2.next)
             {
                 if (tmp.val < tmp2.val)
                 {
                     int buff = tmp.val;
                     tmp.val = tmp2.val;
                     tmp2.val = buff;
                 }
             }
}
		
	}

	@Override
	public void revers() {
		
		Node root2 = null;
        int S = size();
        for (int i = 0; i < S; i++)
        {
            Node tmp = root;
            root = root.next;
            tmp.next = root2;
            root2 = tmp;
        }
root = root2;
		
	}

	@Override
	public void halfRevers() {

		 int S = size();
         if (S <= 1)
         {
             return;
         }
         Node p = null;
         Node tmp = root;
         Node tmp_root = root;
         for (int i = 0; i < S / 2 - 1; i++)
         {
             tmp = tmp.next;
         }
         root = tmp.next;
         tmp.next = p;
         p = tmp_root;
         if (S % 2 != 0)
         {
             tmp_root = root;
             root = root.next;
             tmp_root.next = p;
             p = tmp_root;
         }
         tmp = root;
         while (tmp.next != null)
         {
             tmp = tmp.next;
         }
tmp.next = p;
		
	}

	@Override
	public int get(int pos) {
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        if ((pos < 0) || (pos > size()))
        {
            throw new IllegalArgumentException();
        }
        Node tmp = root;
        int ret = 0;
            for (int i = 0; i < pos; i++)
            {
                tmp = tmp.next;
            }
            ret = tmp.val;
return ret;
	}

	@Override
	public void set(int pos, int val) {

		if ((pos < 0) || (pos > size()))
        {
            throw new IllegalArgumentException();
        }
        if (root == null)
        {throw new IllegalArgumentException();}
        Node p = new Node(val);
        if (pos != 0)
        {
            Node tmp = root;
            for (int i = 0; i < pos-1; i++)
            {
                tmp = tmp.next;
            }
            p.next = tmp.next.next;
            tmp.next = p;
        }
        else
        {
            p.next = root.next;
            root = p;
}
		
	}
	@Override
	public String toString()
    {
        String str = "";
        Node tmp = root;
        while (tmp != null)
        {
            if (tmp.next != null)
            {
                str += tmp.val + ", ";
                tmp = tmp.next;
            }
            else
            {
                str += tmp.val;
                tmp = tmp.next;
            }
        }
        return str;
}
	
}
