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
		l.init(int[] new int[]);
		System.out.println(l);
		
//		System.out.println(a);
				
	}
}
