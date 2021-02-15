package conditionalstatements1;

public class NestedIfElse {

	public static void main(String[] args) {
	//	 int a=12,b=18,c=100;
	// int result=0;
	//	 if(a>b) {
	//		 if(a>c) {
		//		 result=a;
		//	 }
		//	 else {
			//	 result=c;
		//	 }
		// }
		//	 else {
		//		 if(b>c) {
		//			 result=b;
		//		 }
		//		 else {
			//		 result=c;
		//		 }
		//	 }
	 
	// result= a>b ? a>c ? a:c:b>c?b:c;
	//		System.out.println("max of three number is "+result); 
		
		int a=15;
		int b=8;
		int maxOfBothNumbers=0;
		maxOfBothNumbers=a>b?a:b;
		System.out.println("max of both number is "+maxOfBothNumbers);
		
	}
		 }
	

