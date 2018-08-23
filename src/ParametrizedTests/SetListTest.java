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
public class SetListTest 
{
	
	    @Parameters(name = "{index}: SetTest")
	    public static Collection<Object[]> data()
	    {
	        return Arrays.asList(new Object[][]
	        	{     
	        	{  new int[]{}, 		 1, 11,new int[]{} }, 
                {  new int[]{0}, 		 2,	11,new int[]{0} },
                {  new int[]{-1}, 		 3,	11,new int[]{-1} },
                {  new int[]{1,2},		 4,	11,new int[]{1,2} },
                {  new int[]{1,2,3,4,5}, 5, 11,new int[]{1,2,3,4,5} }
                   
	           });
	    }

	    private int[] expAlist;
	    private int pos;
	    private int val;
	    private int[] inputData;

	    public SetListTest(int[] inputData, int pos, int val, int[] expAlist) 
	    {
	        this.expAlist = expAlist;
	        this.pos = pos;
	        this.val = val;
	        this.inputData = inputData;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	@Test
	public void SetArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.init(inputData);
	   	act.set(pos,val);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void SetArrayList1 ()
		{
			Elist act = new AList1();
			act.init(inputData);
		   	act.set(pos,val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void SetArrayList2 ()
		{
			Elist act = new AList2();
			act.init(inputData);
		   	act.set(pos,val);
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void SetLinkedList1 ()
		{
			Elist act = new LList();
			act.init(inputData);
			act.set(pos,val);
			assertArrayEquals(expAlist, act.toArray());
		}
	
}


