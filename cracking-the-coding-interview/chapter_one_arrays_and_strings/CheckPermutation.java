package chapter_one_arrays_and_strings;

public class CheckPermutation {
	
boolean permutation(String s, String t) {
	if(s.length()!=t.length()) {
		return false;
	}
	int[] letters=new int[128];
	char[] s_array=s.toCharArray();
	for(char c:s_array) {
		letters[c]++;
	}
	for(int i=0;i<t.length();i++) {
		int c=(int) t.charAt(i);
		letters[c]--;
		if(letters[c]<0) {
			return false;
		}
	}
	return true;
}
}