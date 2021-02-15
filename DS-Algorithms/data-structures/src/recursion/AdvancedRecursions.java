package recursion;

import java.util.HashSet;
import java.util.Set;

public class AdvancedRecursions {
static Set<String> set=new HashSet<>();
	public static void main(String[] args) {
	//	permutations("abcc",0,3);
int a[]= {1,5,700,2};
System.out.println(coinMax(a,0,a.length-1));
	}
	static int coinMax(int a[],int l,int r) {
		if(l+1==r) {
			return  Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+Math.min(coinMax(a,l+2,r), coinMax(a,l+1,r-1)),a[r]+
				Math.min(coinMax(a,l+1,r-1), coinMax(a,l,r-2)));
	}
	static void permutations(String s,int l,int r) {
		if(l==r) {
			if(set.contains(s))return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s=interchangeChar(s,l,i);
			permutations(s,l+1,r);
			s=interchangeChar(s,l,i);
		}
	}
static String interchangeChar(String s,int a,int b) {
	char array[]=s.toCharArray();
	char temp=array[a];
	array[a]=array[b];
	array[b]=temp;
	return String.valueOf(array);
}
}
