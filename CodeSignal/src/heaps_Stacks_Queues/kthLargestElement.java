int kthLargestElement(int[] nums, int k) {
PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
for(int i:nums){
    minHeap.add(i);
    if(minHeap.size()>k){
        minHeap.remove();
    }
}
return minHeap.remove();
}
