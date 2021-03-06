package chapter_eight_recursion_and_dynamicProgramming;
import java.util.*;
public class Parens {

	void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count) {
		if(leftRem<0 || rightRem<leftRem)return;  //invalid state
		
		if(leftRem==0 && rightRem==0) { // no more parens left
			String s = String.copyValueOf(str);
			list.add(s);
		}else {
			if(leftRem>0) {
				str[count]='(';
				addParen(list, leftRem-1,rightRem,str,count+1);
			}
			if(rightRem>leftRem) {
				str[count]=')';
				addParen(list,leftRem,rightRem-1,str,count+1);
			}
		}
	}
	ArrayList<String> generateParens(int count){
		char[] str=new char[count*2];
		ArrayList<String> list=new ArrayList<String>();
		addParen(list,count,count,str,0);
		return list;
	}
}
