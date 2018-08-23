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
public class SortListTest 
{
	
	    @Parameters(name = "{index}: SortTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	        	{  new int[]{}, 		 	new int[]{} }, 
                {  new int[]{0}, 		 	new int[]{0} },
                {  new int[]{-1}, 		 	new int[]{-1} },
                {  new int[]{2,1},		 	new int[]{1,2} },
                {  new int[]{1,2,3,4,5},    new int[]{5,2,3,4,5} },
                {  new int[]{0,2,3,4,0},    new int[]{0,0,2,3,4,5} },
                {  new int[]{0,1,3,-6,5},    new int[]{-6,0,1,3,5} }
                   
	           });
	    }

	    private int[] expAlist;
	
	    private int[] inputData;

	    public SortListTest(int[] inputData, int[] expAlist) 
	    {
	        this.expAlist = expAlist;
	       
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void SortArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.sort();
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void SortdArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
			act.sort();
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void SortdArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
			act.sort();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	@Test
	public void SortLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
			act.sort();
		   	assertArrayEquals(expAlist, act.toArray());
		}
}


