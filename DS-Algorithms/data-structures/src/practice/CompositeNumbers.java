package practice;

import java.util.Scanner;

public class CompositeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number=sc.nextInt();
		int i=1,count=0;
		while(i<number) {
			if(number%i==0) {
				count++;
			}
			i++;
		}
		if(count>2) {
			System.out.println(number+" is a composite number");
		}
		else {
			System.out.println(number+" is not a composite number");
		}
	}

}
