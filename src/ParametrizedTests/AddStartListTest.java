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
public class AddStartListTest 
{
	
	    @Parameters(name = "{index}: AddStarttTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
		            {  new int[]{}, 1, new int[]{1} }, 
	                {  new int[]{0}, 2, new int[]{2,0} },
	                {  new int[]{1,2}, 3, new int[]{3,1,2} },
	                {  new int[]{1,2,3,4,5}, -1, new int[]{-1,1,2,3,4,5} }
                   
	           });
	    }

	    private int[] expAlist;
	    private int val;
	    private int[] inputData;

	    public AddStartListTest(int[] inputData, int val, int[] expAlist) 
	    {
	        this.expAlist = expAlist;
	        this.val = val;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void AddStarttArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.addStart(val);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void AddStartArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void AddStartArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
		   	act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void AddStartLinkedList1 ()
	
		{
			Elist act = new LList();
			act.init(inputData);
			act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	@Test
	public void AddStartLinkedList2 ()
	
		{
			Elist act = new LList2();
			act.init(inputData);
			act.addStart(val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
}


