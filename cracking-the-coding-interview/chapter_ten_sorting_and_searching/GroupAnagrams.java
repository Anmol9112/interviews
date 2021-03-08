package chapter_ten_sorting_and_searching;
import java.util.*;
public class GroupAnagrams {

	void sort(String[] array) {
		HashMap<String,String> mapList=new HashMap<String,String>();
		
		//group words by anagram
		for(String s:array) {
			String key=sortChars(s);
			mapList.put(key, s);
		}
		//convert hash table to array
		int index=0;
		for(String key:mapList.keySet()) {
			ArrayList<String> list=mapList.get(key);
			for(String t:list) {
				array[index]=t;
				index++;
			}
		}
	}
	String sortChars(String s) {
		char[] content=s.toCharArray();
		Arrays.sort(content);
		return new String(content);
		}
}
