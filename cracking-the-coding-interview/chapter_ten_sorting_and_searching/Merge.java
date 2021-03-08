package chapter_ten_sorting_and_searching;
import java.util.*;
public class Merge {

	void merge(int[] a,int[] b, int lastA, int lastB) {
		int indexA=lastA-1; //index of last element in array a
		int indexB=lastB-1; //index of last element in array b
		int indexMerged=lastB+lastA-1; //end of merged array
		
		while(indexB>=0) {
			if(indexA>=0  && a[indexA]>b[indexB]) {
				a[indexMerged]=a[indexA]; //copy element
				indexA--;
			}else {
				a[indexMerged]=b[indexB]; //copy element
				indexB--;
			}
			indexMerged--; //move indices
		}
	}
}
