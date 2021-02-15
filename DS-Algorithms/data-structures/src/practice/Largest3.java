package practice;

public class Largest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,13,1,10,34,1};
int n=a.length;
print3Largest(a,n);
	}
	static void print3Largest(int a[],int arr_size) {
		int i,first,second,third;
		if(arr_size<3) {
			System.out.print("Invalid Input");
			return;
		}
		third=first=second=Integer.MIN_VALUE;
		for(i=0;i<arr_size;i++) {
			if(a[i]>first) {
				third=second;
				second=first;
				first=a[i];
			}else if(a[i]>second) {
				third=second;
				second=a[i];
			}else if(a[i]>third) {
				third=a[i];
			}
				System.out.println("Three Largest elements are:"+first+" "+second+" "+third);
		}
	}
}

