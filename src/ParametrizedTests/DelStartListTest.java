package ParametrizedTests;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals ;

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
	        	{  new int[]{}, 		 	new int[]{} , 0}, 
                {  new int[]{0}, 		 	new int[]{} , 0},
                {  new int[]{-1}, 		 	new int[]{} , -1},
                {  new int[]{1,2},		 	new int[]{2}, 1 },
                {  new int[]{1,2,3,4,5},  new int[]{2,3,4,5}, 1 }
                   
	           });
	    }

	    private int[] expArr;
	    private int[] inputData;
	     private int val;
	  

	    public DelStartListTest( int[] inputData, int[] expArr, int val) 
	    {
	        this.expArr = expArr;
	        this.inputData = inputData;
	        this.val = val;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	      
	    @Test
		public void DelStartArrayList0_val ()
		{
		   	Elist act = new AList0();
		   	act.init(inputData);
		   	assertEquals (val, act.delStart());
		}    

	public void DelStartValArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.delStart();
	   	assertEquals (expArr, act.toArray());

	}

	@Test
	public void DelStartArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
			act.delStart();
		 	assertArrayEquals (expArr,act.toArray() );
		}
		
	@Test
	public void DelStartArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
			act.delStart();
		 	assertArrayEquals (expArr, act.toArray());
		}
	@Test
	public void DelStartLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
			act.delStart();
		 	assertArrayEquals (expArr, act.toArray());
		}
	
	@Test (expected = IllegalArgumentException.class)
		public void DelStartArrayList0_null ()
		{
		   	Elist act = new AList0();
		   	act.init(inputData);
		    act.delStart();
		}  
	
	@Test
	public void DelStartLinkedList2 ()
		{
			Elist act = new LList2();
			act.init(inputData);
			act.delStart();
		 	assertArrayEquals (expArr, act.toArray());
		}
}


