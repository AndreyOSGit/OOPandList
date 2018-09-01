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
public class AddPosListTest 
{
	
	    @Parameters(name = "{index}: AddPosTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
		        	{  new int[]{}, 		 0, 15,	new int[]{} }, 
	                {  new int[]{0}, 		 1, 15,	new int[]{0,15} },
	                {  new int[]{-1}, 		 0,	15, new int[]{15,-1} },
	                
	                {  new int[]{1,2},		 1,	15, new int[]{1,15,2} },
	                {  new int[]{1,2},		 4,	15, new int[]{1,2,15} },
	                {  new int[]{1,2,3,4,5}, 5, 15, new int[]{1,2,3,4,15,5} }
	           });
	    }

	    private int[] expArray;
	    private int pos;
	    private int val;
	    private int[] inputData;

	    public AddPosListTest(int[] inputData, int pos, int val, int[] expArray) 
	    {
	    	this.inputData = inputData;
	        this.expArray = expArray;
	        this.pos = pos;
	        this.val = val;
	       
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void addPosArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.addPos(pos, val);
	   	assertArrayEquals(expArray, act.toArray());
	}
	

	@Test
	public void addPosArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	act.addPos(pos, val);
		   	assertArrayEquals(expArray, act.toArray());
		}
		
	@Test
	public void addPosArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
		   	act.addPos(pos, val);
		   	assertArrayEquals(expArray, act.toArray());
		}
	
	@Test
	public void addPosLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
			act.addPos(pos, val);
			assertArrayEquals(expArray, act.toArray());
		}
	@Test
	public void addPosLinkedList2 ()
		{
			Elist act = new LList2();
			act.init(inputData);
			act.addPos(pos, val);
			assertArrayEquals(expArray, act.toArray());
		}
}


