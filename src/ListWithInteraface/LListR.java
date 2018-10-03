package ListWithInteraface;

public class LListR implements Elist{
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
	 Node front = null;
Node rear = null;
	@Override
	public void clear() {

		   front = null;
		   rear = null;
		
	}

	@Override
	public void init(int[] ini) {
		   clear();
           if (ini == null)
           {
               ini = new int[0];
           }
           front = null;
           rear = null;
           for (int i = 0 ; i < ini.length; i++)
           {
               addEnd(ini[i]);
}
		
	}

	@Override
	public int[] toArray() {


		  int[] ret = new int[size()];
          Node tmp = rear;
          int i = 0;
          int s = size();
          while (tmp != null)
          {

              ret[s - i - 1] = tmp.val;
              i++;
              tmp = tmp.prev;
          }
return ret;

	}

	@Override
	public int size() {


        int ret = 0;
        Node tmp = front;
        while (tmp != null)
        {
            ret++;
            tmp = tmp.next;
        }
return ret;

	}

	@Override
	public void addStart(int val) {
	
		Node p = new Node(val);
          if (front == null)
          {
              front = p;
              rear = p;
          }
          else
          {
              p.next = front;
              front.prev = p;
              front = p;
}
	}

	@Override
	public void addEnd(int val) {

		Node p = new Node(val);
        if (front == null)
        {
            front = p;
            rear = p;
        }
        else
        {
            p.prev = rear;
            rear.next = p;
            rear = p;
}
		
	}

	@Override
	public void addPos(int pos, int val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delStart() {

		  if (front == null)
          {
              throw new IllegalArgumentException();
          }
          int ret = front.val;
          if (front.next == null)
          {
              front = null;
              rear = null;
          }
          else
          {
              if (front.next == null)
              {
                  front = null;
              }
              else
              {
                  front = front.next;
                  front.prev = null;
              }
          }
return ret;
		
	}

	@Override
	public int delEnd() {

		   if (front == null)
           {
               throw new IllegalArgumentException();
           }
           int ret = rear.val;
           if (rear.prev == null)
           {
               front = null;
               rear = null;
           }
           else
           {
               rear = rear.prev;
               rear.next = null;
           }
return ret;
		
	}

	@Override
	public int delPos(int pos) {

		 if (front == null)
         {
             throw new IllegalArgumentException();
         }
         if ((pos < 0)||(pos> size()))
         {
             throw new IllegalArgumentException();
         }
         int ret = 0;
         if (front.next == null)
         {
             ret = front.val;
             front = null;
             rear = null;
         }
         else
         {
             if (pos == 0)
             {
                 ret = front.val;
                 front.next.prev = null;
                 front = front.next;

             }
             else if (pos == size() - 1)
             {
                 ret = rear.val;
                 rear.prev.next = null;
                 rear = rear.prev;
             }
             else
             {
                 Node tmp = front;
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
