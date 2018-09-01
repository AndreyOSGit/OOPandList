package ListWithInteraface;

public class LList2 implements Elist {

	Node root = null;
	Node end = null;
	class Node
	{
		public int val;
        public Node next;
        public Node prev;
        public Node(int val)
        {
            this.val = val;
}
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
 root = null;
end = null;
	}

	@Override
	public void init(int[] ini) {

		 clear();
         if (ini == null)
         {
             ini = new int[0];
         }
         root = null;
         end = null;
         for (int i = 0 ; i < ini.length; i++)
         {
             addEnd(ini[i]);
}
	}

	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		 int[] ret = new int[size()];
         Node tmp = root;
         int i = 0;
         while (tmp != null)
         {
             ret[i++] = tmp.val;
             tmp = tmp.next;
         }
         return ret;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int ret = 0;
        Node tmp = root;
        while (tmp != null)
        {
            ret++;
            tmp = tmp.next;
        }
return ret;
	}

	@Override
	public void addStart(int val) {
		// TODO Auto-generated method stub
		 Node p = new Node(val);
         if (root == null)
         {
             root = p;
             end = p;
         }
         else
         {
             p.next = root;
             root.prev = p;
             root = p;
}
	}

	@Override
	public void addEnd(int val) {
		// TODO Auto-generated method stub
		Node p = new Node(val);
        if (root == null)
        {
            root = p;
            end = p;
        }
        else
        {
            p.prev = end;
            end.next = p;
            end = p;
}
	}

	@Override
	public void addPos(int pos, int val) {
		if (pos < 0||pos > size())
        {
            throw new IllegalArgumentException();
        }
        if (pos == 0)
            addStart(val);
        else
        {
            Node p = new Node(val);
            Node tmp = root;
            for (int i = 0; i < pos - 1; i++)
            {
                tmp = tmp.next;
            }
            p.next = tmp.next;
            p.prev = tmp.next.prev;
            
                       //?
            tmp.next.prev = p;
            tmp.next = p;
}
	}

	@Override
	public int delStart() {
		if (root == null)
        {
            throw new IllegalArgumentException();
        }
        int ret = root.val;
        if (root.next == null)
        {
            root = null;
            end = null;
        }
        else
        {
            if (root.next == null)
            {
                root = null;
            }
            else
            {
                root = root.next;
                root.prev = null;
            }
        }
return ret;
	}

	@Override
	public int delEnd() {
		 if (root == null)
         {
             throw new IllegalArgumentException();
         }
         int ret = end.val;
         if (end.prev == null)
         {
             root = null;
             end = null;
         }
         else
         {
             end = end.prev;
             end.next = null;
         }
return ret;
	}

	@Override
	public int delPos(int pos) {
		 if (root == null)
         {
             throw new IllegalArgumentException();
         }
         if ((pos < 0)||(pos> size()))
         {
             throw new IllegalArgumentException();
         }
         int ret = 0;
         if (root.next == null)
         {
             ret = root.val;
             root = null;
             end = null;
         }
         else
         {
             if (pos == 0)
             {
                 ret = root.val;
                 root.next.prev = null;
                 root = root.next;

             }
             else if (pos == size() - 1)
             {
                 ret = end.val;
                 end.prev.next = null;
                 end = end.prev;
             }
             else
             {
                 Node tmp = root;
                 for (int i = 0; i < pos - 1; i++)
                 {
                     tmp = tmp.next;
                 }
                 ret = tmp.next.val;
                 tmp.next = tmp.next.next;
                 tmp.next.prev = tmp;
             }
         }
         
return ret;
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
                     int buf = tmp.val;
                     tmp.val = tmp2.val;
                     tmp2.val = buf;
                 }
             }
}
		
	}

	@Override
	public void revers() {
	     Node p = null;
         Node tmp = root;
         Node r = end;
         root = root.next;
         tmp.next = p;
         tmp.prev = r;
         p = tmp;
         r = tmp;
         int S = size();
         for (int i = 1; i < S; i++)
         {
             tmp = root;
             root = root.next;
             tmp.next = p;
             tmp.prev = p.prev;
             p.prev = tmp;
             p = tmp;
}
	}

	@Override
	public void halfRevers() {
		  int S = size();
          if (S <= 1)
          {
              return;
          }
          Node p = null;
         // Node r = null;
          Node tmp = root;
          Node tmp_root = root;
          Node tmp_end = end;
          for (int i = 0; i < S / 2 - 1; i++)
          {
              tmp = tmp.next;
          }
          root = tmp.next;
          tmp.next = p;
          tmp_end = tmp;
          p = tmp_root;
          if (S % 2 != 0)
          {
              tmp_root = root;
              root = root.next;
              tmp_root.next = p;
              p = tmp_root;
          }
          end.next = p;
          end = tmp_end;
      }
      public void Sort()
      {
          Node tmp;
          Node tmp2;
          for (tmp = root; tmp != null; tmp = tmp.next)
          {
              for (tmp2 = root; tmp2.next != null; tmp2 = tmp2.next)
              {
                  if (tmp.val < tmp2.val)
                  {
                      int buf = tmp.val;
                      tmp.val = tmp2.val;
                      tmp2.val = buf;
                  }
              }
}

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
          {
              throw new IllegalArgumentException();
          }
          Node tmp = root;
          for (int i = 0; i < pos; i++)
          {
              tmp = tmp.next;
          }
tmp.val = val;

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
