int insertBits(int n, int a, int b, int k) {
if(b<a){
    return -1;
}
int d1=((1<<(b-a+1))-1);
k&=d1;
n&=~(d1<<a);
return n | (k<<a);

}
