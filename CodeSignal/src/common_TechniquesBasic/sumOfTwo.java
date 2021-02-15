boolean sumOfTwo(int[] a, int[] b, int v) {
Arrays.sort(a);
Arrays.sort(b);
for(int i=0;i<a.length;i++){
    for(int j=b.length-1;j>=0;j--){
        if(a[i]>v && b[j]<v){
        break;
        }
        if(a[i]+b[j]==v){
            return  true;
        }
    }
}
return false;
}
