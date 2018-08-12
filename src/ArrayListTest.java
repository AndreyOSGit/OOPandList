

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
	   	int[] exp = { -1, 0, 1, 4, 11, 15 };
    	int act = AR.ArMaxElIndex(TestArray);
    	assertArrayEquals(exp, act);
	}
	

}
