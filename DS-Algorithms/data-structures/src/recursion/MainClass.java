package recursion;

public class MainClass {
static int stepCount=0;
	public static void main(String[] args) {
//	System.out.println(sum(5));
//System.out.println(pow(3,10000));
//System.out.println("steps"+stepCount);
//stepCount=0;
//System.out.println(fastpow(3,10000));
//System.out.println("steps"+stepCount);
		System.out.println(path(4,4));
	}
static int sum(int n) {
	if(n==1) {
		return 1;
}
return n+sum(n-1);
}
static int pow(int a,int b) {
	stepCount++;
	if(b==0) {
		return 1;
	}
	return a*pow(a,b-1);
}
static int fastpow(int a,int b) {
	stepCount++;
	if(b==0) {
		return 1;
	}
	if(b%2==0) {
		return fastpow(a*a,b/2);
	}
	return a*fastpow(a,b-1);
}
static int path(int n,int m) {
	if(n==1||m==1) {
		return 1;
	}
	return path(n,m-1)+path(m,n-1);
}
}