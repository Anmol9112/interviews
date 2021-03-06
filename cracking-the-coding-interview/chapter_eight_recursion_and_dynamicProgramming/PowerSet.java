package chapter_eight_recursion_and_dynamicProgramming;
import java.util.*;

public class PowerSet {

	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size()==index) {
			allsubsets=new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>()); //Empty set
		}else {
			allsubsets = getSubsets(set, index+1);
			int item=set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset: allsubsets) {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
}
