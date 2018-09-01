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
public class HalfReversListTest 
{
	
	    @Parameters(name = "{index}: HalfHalfReversersTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	        	{  new int[]{}, 		 	new int[]{} }, 
                {  new int[]{0}, 		 	new int[]{0} },
                {  new int[]{-1}, 		 	new int[]{-1} },
                {  new int[]{1,2},		 	new int[]{2,1} },
                {  new int[]{1,2,3,4,5},  new int[]{4,5,3,1,2} }
                   
	           });
	    }

	    private int[] expAlist;
	    private int[] inputData;

	    public HalfReversListTest(int[] inputData,  int[] expAlist) 
	    {
	        this.expAlist = expAlist;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void HalfHalfReversersArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.halfRevers();
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void HalfReversArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	act.halfRevers();
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void HalfReversArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
		   	act.halfRevers();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void HalfReversLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
		   	act.halfRevers();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void HalfReversLinkedList2 ()
		{
			Elist act = new LList2();
			act.init(inputData);
		   	act.halfRevers();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
}


