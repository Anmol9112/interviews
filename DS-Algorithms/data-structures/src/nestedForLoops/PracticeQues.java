package nestedForLoops;

import java.util.Scanner;

public class PracticeQues {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int rows=sc.nextInt();
//	for(int i=rows;i>=1;i--)
//	{
//		for(int j=rows;j>i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		 int rows=2*n-1;
//		 for(int i=1;i<=rows;i++) {
//		 if(i<=n) {
//			 for(int j=1;j<=i;j++)
//			 {
//				 System.out.print("* ");
//			 }
//		 }
//		 else {
//			 for(int j=1;j<=rows-i+1;j++) {
//				 System.out.print("* ");
//			 }
//		 }
//			 System.out.println();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=0;i<n;i++){
			for(int j=n-i;j>1;j--) {
		
		
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}	
}
}