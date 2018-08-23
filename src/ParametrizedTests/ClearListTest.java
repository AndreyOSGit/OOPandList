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
public class ClearListTest 
{
	
	    @Parameters(name = "{index}: ClearTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	                 {  new int[]{}, new int[]{} }, 
	                 {  new int[]{0},  new int[]{} },
	                 {  new int[]{-1},  new int[]{} },
	                 {  new int[]{1,2},  new int[]{} },
	                 {  new int[]{1,2,3,4,5},  new int[]{} },
                   
	           });
	    }

	    private int[] expAlist;
	    private int[] inputData;

	    public ClearListTest( int[] inputData, int[] expAlist ) 
	    {
	        this.expAlist = expAlist;
	    
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void ClearArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.clear();
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void ClearArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	act.clear();
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void ClearArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
			
		   	act.clear();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void ClearLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
		   	act.clear();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	
}


