package ParametrizedTests;


import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ListWithInteraface.*;

@RunWith(value = Parameterized.class)
public class DelEndListTest 
{
	
	    @Parameters(name = "{index}: DelEndTest")
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

	    public DelEndListTest(int[] expAlist, int val, int[] actAlist) 
	    {
	        this.expAlist = expAlist;
	        this.val = val;
	        this.actAlist = actAlist;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void addArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.addStart(val);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void adddArrayList1 ()
		{
			Elist act = new AList1();
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void adddArrayList2 ()
		{
			Elist act = new AList2();
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void adddLinkedList1 ()
		{
			Elist act = new LList();
			act.;
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
}


