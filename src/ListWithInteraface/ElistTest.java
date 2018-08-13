package ListWithInteraface;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ElistTest {
	
	Elist list = null;
//	int index = 0;
	public ElistTest(Elist pam)
	{
		list = pam;
	}
	
	@Parameters
//	public static Collection<Object[][]> data()
//	{
//        return Arrays.asList(new Object[][]
//	        	{     
//	                 {  new int[]{} }, 
//	                 {  new int[]{0}},
//	                 {  new int[]{1}},
//                   
//	           };)
//	}
	@Before
	public void clear()
	{
		list.clear();
	}

}
