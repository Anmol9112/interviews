package arrays;

int firstDuplicate(int[] a) {
int min=-1;
Set<Integer> set=new HashSet<Integer>();
for(int i=0;i<a.length;i++){
    if(!set.add(a[i])){
        return a[i];
    }
}
return -1;
}
