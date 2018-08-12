

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ArrayListTest 
{
	
	    @Parameters(name = "{index}: testAdd")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	                 {  new int[]{}, 1, new int[]{1} }, 
	                 {  new int[]{0}, 2, new int[]{0} },
	                 {  new int[]{1}, 3, new int[]{1} },
                   
	           });
	    }

	    private int[] expAlist;
	    private int val;
	    private int[] actAlist;

	    public ArrayListTest(int[] expAlist, int val, int[] actAlist) 
	    {
	        this.expAlist = expAlist;
	        this.val = val;
	        this.actAlist = actAlist;
	    }
	
	// nugen init - ��� �������� ������� and toArray - ��� ����������� ����������
	//
	
	@Test
	public void addTest1 ()
	{
	   	myArrayList act = new myArrayList();
	   	act.addStart(val);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

		@Test
		public void addTest2 ()
		{
		   	myArrayList act = new myArrayList();
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	
}


