package practice;

public class Union {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {2,3,5,7};
		int n=a1.length;
		int m=a2.length;
printUnion(a1,a2,m,n);
	}
 static int printUnion(int a1[],int a2[],int m,int n) {
	int i=0,j=0;
	while(i<m && j<n) {
		if(a1[i]<a2[j]) {
			a1[i]+=1;
			System.out.println(a1[i]);
		}else if(a2[j]<a1[i]) {
			a2[j]+=1;
			System.out.println(a2[j]);
		}else {
			a2[j]+=1;
			System.out.println(a2[j]);
			a1[i]+=1;
		}
	}
	while(i<m) {
		a2[j]+=1;
		System.out.println(a2[j]);
	}
	while(j<n) {
		a1[i]+=1;
		System.out.println(a1[i]);
	}
	return printUnion(a1,a2,m,n);
}
}
