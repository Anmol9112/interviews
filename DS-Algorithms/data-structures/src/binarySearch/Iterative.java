package binarySearch;

public class Iterative {

	public static boolean binarySearchIterative(int[] array,int x) {
		int left =0;
		int right=array.length-1;
		while(left<=right) {
			int mid=(left+(right-left)/2);
			if(array[mid]==x) {
				return true;
			}else if(array[mid]<x) {
				left=mid-1;
			}else {
				left=mid+1;
			}
			
		}
return false;
	}
	
	}

