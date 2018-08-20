package ParametrizedTests;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ListWithInteraface.*;

@RunWith(value = Parameterized.class)
public class toStringListTest 
{
	
	    @Parameters(name = "{index}: toStringTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	                 {  new int[]{},  "[]" }, 
	                 {  new int[]{0},  "[0, ]" },
	                 {  new int[]{1,2},  "[1, 2, ]" },
	                 {  new int[]{0,1,2,3,5},  "[0, 1, 2, 3, 5, ]" }
                   
	           });
	    }

	    private String expAlist;

	    private int[] actAlist;

	    public toStringListTest(int[] actAlist, String expAlist ) 
	    {
	        this.expAlist = expAlist;

	        this.actAlist = actAlist;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void addArrayList0 ()
	{
	   	Elist act = new AList0();
	   	
	   	assertEquals(expAlist, (act.toString()));
	}
	

	@Test
	public void adddArrayList1 ()
		{
			Elist act = new AList1();
			assertEquals(expAlist, (act.toString()));
		}
		
	@Test
	public void adddArrayList2 ()
		{
			Elist act = new AList2();
			assertEquals(expAlist, (act.toString()));
		}
	@Test
	public void adddLinkedList1 ()
		{
			Elist act = new LList();
			assertEquals(expAlist, (act.toString()));
		}
	
}


