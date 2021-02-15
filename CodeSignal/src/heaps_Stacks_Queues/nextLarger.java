int[] nextLarger(int[] a) {
int[] ret=new int[a.length];
for(int i=a.length-1;i>=0;i--){
    if(i==a.length-1){
        ret[i]=-1;
        continue;
    }
    int ival=a[i];
    ret[i]=-1;
 for(int x=i+1;x<a.length;x++){
     int xVal=a[x];
     if(xVal>ival){
        ret[i]=xVal;
        break;
        
     }
 }   
}
return ret;
}