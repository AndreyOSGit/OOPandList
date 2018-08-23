

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;
import ListWithInteraface.*;
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
	    private int[] inputData;

	    public ArrayListTest(int[] inputData, int val, int[] expAlist) 
	    {
	        this.expAlist = expAlist;
	        this.val = val;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void addArrayList0 ()
	{
	   	myArrayList act = new myArrayList();
	   	act.addStart(val);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

		@Test
		public void revArrayList1 ()
		{
		   	myArrayList act = new myArrayList();
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
		@Test
		public void revArrayList2 ()
		{
		   	myArrayList act = new myArrayList();
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	
}


