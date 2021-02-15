package practice;
import java.util.*;
class Ques1 {

	public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//		int[] a=new int[10];
//		System.out.println("Enter 10 integers of array: ");
//		for( int  i=0;i<10;i++) {
//			a[i]=sc.nextInt();
//		}
//System.out.println("You have entered: ");
//for(int i=0;i<10;i++) {
//	System.out.print(a[i]+" ");
//}
//		int arr[]= {2,7,8,4,10,11};
//		int tocheckValue=7;
//		System.out.println("Array:"+ Arrays.toString(arr));
//		boolean test=false;
//		for(int element:arr) {
//			if(element==tocheckValue) {
//				test=true;
//				break;
//			}
//		}
//		System.out.println("Is "+tocheckValue +" present in array: "+test);
//		int arr[]= {2,4,9,12,17};
//		int n=arr.length;
//		System.out.println("Minimum element "+"of array: "+getMin(arr,n));
//		System.out.println("Maximum element "+"of array: "+getMax(arr,n));
//	}
//	static int getMin(int arr[],int n) {
//		int res=arr[0];
//		for(int i=1;i<n;i++) 
//			res=Math.min(res,arr[i]);
//			return res;
//		}
//		static int getMax(int arr[],int n) {
//			int res=arr[0];
//		for(int i=1;i<n;i++) 
//			res=Math.max(res, arr[i]);
//		return res;
	//	Scanner sc=new Scanner(System.in);
//int[] a=new int[] {1,2,3,4,5};
//System.out.println("Original array: ");
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Array in reverse order: ");
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
	
//		int a[]=new int[] {1,2,3,3,3,3,5,3,4,5,3};
//		int x=3;
//		int n=a.length;
//		System.out.println(frequency(a,n,x));
//	}
//	public static int frequency(int a[],int n,int x) {
//		int count=0;
//			for(int i=0;i<n;i++) 
//				if(a[i]==x) 
//					count++;
//					return count;
//				
//		float arr[]= {5,10,15};
//		int n=arr.length;
//		findRangeAndCoefficient(arr,n);
//	}
//	static float getMax(float arr[],int n) {
//		float res=arr[0];
//		for(int i=1;i<n;i++) 
//			res=Math.max(res,arr[i]);
//			return res;
//		}
//		static float getMin(float arr[],int n) {
//			float res=arr[0];
//			for(int i=1;i<n;i++) 
//				res=Math.min(res,arr[i]);
//				return res;
//		}
//			static void findRangeAndCoefficient(float arr[],int n) {
//				float max=getMax(arr,n);
//				float min=getMin(arr,n);
//				float range=max-min;
//				float coeffofRange=range/(max+min);
//				System.out.println("Range: " +range);
//				System.out.println("CoeffofRange: "+coeffofRange);
		int arr[]= {1,-3,3,-4,21,91};
		int n=arr.length;
		reArrange(arr,n);
		printArray(arr,n);
			}
	static void reArrange(int arr[],int n) {
		int j=0,temp;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				j++;
			}
		}
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}
