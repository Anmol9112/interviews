package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		int marks[]=new int[n];
		int averagemarks=0;
		System.out.println("Enter the marks now: ");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			averagemarks+=marks[i];
		}
		averagemarks/=n;
	System.out.println("average marks is "+averagemarks);

}
}