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
	                 {  new int[]{}, new int[]{0} }, 
	                 {  new int[]{0},  new int[]{0} },
	                 {  new int[]{-1},  new int[]{0} },
	                 {  new int[]{1,2},  new int[]{0} },
	                 {  new int[]{1,2,3,4,5},  new int[]{0} },
                   
	           });
	    }

	    private int[] expAlist;
	    private int[] actAlist;

	    public ClearListTest(int[] expAlist,  int[] actAlist) 
	    {
	        this.expAlist = expAlist;
	    
	        this.actAlist = actAlist;
	    }
	
	// nugen init - ��� �������� ������� and toArray - ��� ����������� ����������
	//
	
	@Test
	public void addArrayList0 ()
	{
	   	Elist act = new AList0();
	   	act.clear();
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

	@Test
	public void adddArrayList1 ()
		{
			Elist act = new AList1();
			act.clear();
		   	assertArrayEquals(expAlist, act.toArray());
		}
		
	@Test
	public void adddArrayList2 ()
		{
			Elist act = new AList2();
			act.clear();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	@Test
	public void adddLinkedList1 ()
		{
			Elist act = new LList();
			act.clear();
		   	assertArrayEquals(expAlist, act.toArray());
		}
	
	
}


