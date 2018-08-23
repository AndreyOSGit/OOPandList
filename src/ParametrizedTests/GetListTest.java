package ParametrizedTests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ListWithInteraface.*;

@RunWith(value = Parameterized.class)
public class GetListTest 
{
	
	    @Parameters(name = "{index}: GetTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	        	{  new int[]{}, 		 0,	0 }, 
                {  new int[]{0}, 		 0,	0 },
                {  new int[]{-1}, 		 3,	0 },
                {  new int[]{1,2},		 2,	2 },
                {  new int[]{1,2,3,4,5}, 4, 5 }
                   
	           });
	    }

	    private int expElement;
	    private int pos;
	    private int[] inputData;

	    public GetListTest(int[] inputData, int pos, int expElement) 
	    {
	        this.expElement = expElement;
	        this.pos = pos;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void GetArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.get(pos);
	   	assertEquals(expElement, act.get(pos));
	}
	

	@Test
	public void GetArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	act.addStart(pos);
		   	assertEquals(expElement, act.get(pos));
		}
		
	@Test
	public void GetArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
		   	act.addStart(pos);
		   	assertEquals(expElement, act.get(pos));
		}
	@Test
	public void GetLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
		   	assertEquals(expElement, act.get(pos));
		}
	
}


