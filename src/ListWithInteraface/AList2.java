package ListWithInteraface;

public class AList2 implements Elist 
	{
	
	int ar[] = new int[50];
	int start = 25;
	int end = 25;
	@Override
	public void clear() {
		start = ar.length/2;
		end = ar.length/2;
	}
	@Override
	public void init(int[] ini) {
		if ( ini == null ) ini = new int[0];
		start = ar.length/2;
		
		for (int i = 0; i < ini.length; i++)
		{
			ar[start + i] = ini[i];
		}
		end = start + ini.length;
		
	}
	@Override
	public int[] toArray() {
        int[] ret = new int[size()];
        for (int i = start; i < end; i++)
        {
            ret[i - start] = ar[i];
        }
return ret;
	}
	@Override
	public int size() 
	{
		return end-start;
	}
	@Override
	public void addStart(int val) {
		 ar[--start] = val;
		
	}
	@Override
	public void addEnd(int val) {
		ar[end++] = val;
		
	}
	@Override
	public void addPos(int pos, int val) {

		if ((pos > end - start) || (pos < 0))
		{
			throw new IllegalArgumentException();
		}
		for (int i = end; i > start + pos; i--)
		{
			ar[i] = ar[i - 1];
		}
		end++;
		ar[start + pos] = val;

	}
	@Override
	public int delStart() {
		if (start == end)
		{
			throw new IllegalArgumentException();
		}
		start++;
		return ar[start - 1];
	}
	@Override
	public int delEnd() {
		 end--;
		 return ar[end];
	}
	@Override
	public int delPos(int pos) {
		 if (start == end)
         {
             throw new IllegalArgumentException();
         }
         end--;
return ar[end];
	}
	@Override
	public int min() {
		
		  int tmp = start;
          for (int i = start+1; i < end; i++)
          {
              if (ar[tmp] > ar[i])
                  tmp = i;
          }
return tmp - start;
	}
	@Override
	public int max() {
		
		 int tmp = start;
         for (int i = start+1; i < end; i++)
         {
             if (ar[tmp] < ar[i])
                 tmp = i;
         }
return tmp - start;
	}
	@Override
	public int minPos() {
		 int tmp = start;
         for (int i = start+1; i < end; i++)
         {
             if (ar[tmp] > ar[i])
                 tmp = i;
         }
return tmp - start;
	}
	@Override
	public int maxPos() {
		int tmp = start;
        for (int i = start+1; i < end; i++)
        {
            if (ar[tmp] < ar[i])
                tmp = i;
        }
return tmp - start;
	}
	@Override
	public void sort() {
		for (int i = start+1; i < end; i++)
        {
            int j;
            int temp = ar[i];
            for (j = i - 1; j >= start; j--)
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void halfRevers() {
		  for (int i = start; i < start + (end - start) / 2; i++)
          {
              int tmp = ar[i];
              ar[i] = ar[end - (end - start) / 2 + i - start];
              ar[end - (end - start) / 2 + i - start] = tmp;
}
		
	}
	@Override
	public int get(int pos) {
		
		 return ar[pos + start];
	}
	@Override
	public void set(int pos, int val) {
		
		ar[pos+start] = val;
		
	}
		//есть реализация где при инициализации от центар выбирают чет и не чет 
	
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
