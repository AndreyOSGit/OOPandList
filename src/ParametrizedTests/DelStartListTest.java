package ParametrizedTests;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ListWithInteraface.*;

@RunWith(value = Parameterized.class)
public class DelStartListTest 
{
	
	    @Parameters(name = "{index}: DelStartTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	                 {  1, new int[]{1} }, 
	                 {  2, new int[]{2,0} },
	                 {   3, new int[]{3,1,2} },
	                 {   -1, new int[]{-1,1,2,3,4,5} }
                   
	           });
	    }

	    private int expVal;
	    private int[] actAlist;

	    public DelStartListTest( int expVal, int[] actAlist) 
	    {
	        this.expVal = expVal;
	        this.actAlist = actAlist;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void addArrayList0 ()
	{
	   	Elist act = new AList0();
	   	assertEquals(expVal, act.delStart());
	}
	

	@Test
	public void adddArrayList1 ()
		{
			Elist act = new AList1();
		 	assertEquals(expVal, act.delStart());
		}
		
	@Test
	public void adddArrayList2 ()
		{
			Elist act = new AList2();
		 	assertEquals(expVal, act.delStart());
		}
	@Test
	public void adddLinkedList1 ()
		{
			Elist act = new LList();
		 	assertEquals(expVal, act.delStart());
		}
	
}


