package ParametrizedTests;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ListWithInteraface.*;

@RunWith(value = Parameterized.class)
public class MaxListTest 
{
	
	    @Parameters(name = "{index}: MaxTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	            {  new int[]{}, 		   0}, 
                {  new int[]{0},  	 	   0},
                {  new int[]{-1},   	   -1},
                {  new int[]{1,2},   		2},
                {  new int[]{1,2,3,4,5},    5}
                   
	           });
	    }

	    private int exp;
	    private int[] inputData;

	    public MaxListTest(int[] inputData, int exp) 
	    {
	        this.exp = exp;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void MaxArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	 
	   	assertEquals(exp, act.max());
	}
	

	@Test
	public void MaxArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	 
		   	assertEquals(exp, act.max());
		}
		
	@Test
	public void MaxArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
		   	 
		   	assertEquals(exp, act.max());
		}
	@Test
	public void MaxLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
			 
		   	assertEquals(exp, act.max());
		}
	
}


