

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArrayListTest 
{
	
	    @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 {  new int[]{}, new int[]{} }, 
	                 {  new int[]{0}, new int[]{0} },
	                 {  new int[]{1}, new int[]{1} },
	                 { 2, 1 },
	                 { 5, 2 }	                   
	           });
	    }

	    private int[] expAlist;

	    private int[] actAlist;

	    public ArrayListTest(int[] expAlist, int[] actAlist) {
	        this.expAlist = expAlist;
	        this.actAlist = actAlist;
	    }
	
	// nugen init - для передачи массива and toArray - для возвращения результата
	//
	
	public void addTest ()
	{
	   	myArrayList act = new myArrayList();
	   	act.addStart(1);
	   	assertArrayEquals(expAlist, act.toArray());
	}
	

}
