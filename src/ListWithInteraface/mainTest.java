package ListWithInteraface;

import javax.naming.InitialContext;

public class mainTest {

	public static void main(String arg[])
	{
//		String outString = "";
//	for (int i = 0; i < ar.length; i++) 
//		{
//			outString += String.format("%d, ", ar[i]);
//		}
//	
//		outString = String.format("[%s]", outString);
//		System.out.println( outString );		
////		
		AList1 a  = new AList1();
				a.init(new int[] {10,15,16});
		
		LList l = new LList();
		l.init(new int[] {1,2,3,4,5});
		System.out.println(l.size());
		
//		System.out.println(a);
				
	}
}
