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
public class DelPosListTest 
{
	
	    @Parameters(name = "{index}: DelPosTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	        	{  new int[]{}, 		 1,	new int[]{} }, 
                {  new int[]{0}, 		 2,	new int[]{0} },
                {  new int[]{-1}, 		 3,	new int[]{-1} },
                {  new int[]{1,2},		 4,	new int[]{1,2} },
                {  new int[]{1,2,3,4,5}, 5, new int[]{1,2,3,4,5} }
                   
	           });
	    }

	    private int[] expAlist;
	    private int pos;
	    private int[] inputData;

	    public DelPosListTest(int[] inputData, int pos, int[] expAlist) 
	    {
	        this.expAlist = expAlist;
	        this.pos = pos;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void delPosArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.delPos(pos);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void delPosArrayList1 ()
		{
			Elist act = new AList1();
		   	act.delPos(pos);
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void delPosArrayList2 ()
		{
			Elist act = new AList2();
		   	act.delPos(pos);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void delPosLinkedList1 ()
		{
			Elist act = new LList();
			act.delPos(pos);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	@Test
	public void delPosLinkedList2 ()
		{
			Elist act = new LList2();
			act.delPos(pos);
		   	assertArrayEquals(expAlist, act.toArray());
		}
}


