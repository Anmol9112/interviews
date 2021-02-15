package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int temp=n;
//		int reversedNumber=0;
		
//		while(temp>0) {
//			int lastdigit=temp%10;
//			temp/=10;
//			sum+=lastdigit;
//			System.out.println(lastdigit+" "+temp+" "+sum);
//		}
//		System.out.println("the sum of digits of "+n+" is "+ sum);
			
//  int numberOfDigits=(int) Math.log10(n)+1;
//  System.out.println(numberOfDigits);
//		while(temp>0) {
//			int lastdigit=temp%10;
//		reversedNumber=reversedNumber*10+lastdigit;
//		temp/=10;
//	}
//		if(reversedNumber==n)
//		{
//			System.out.println(n +" is palindrome" );
//		}
//		else {
//			System.out.println(n +" is not a palindrome");
//		}
int n=1;
do {
	 n=sc.nextInt();
	System.out.println("number"+n);
}while(n!=0);
}}
