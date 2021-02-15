int countClouds(char[][] skyMap) {
int count=0;
for(int i=0;i<skyMap.length;i++){
    for(int j=0;j<skyMap[i].length;j++){
        if(skyMap[i][j]=='1'){
            count+=1;
            callBFS(skyMap,i,j);
        }
    }
}
return count;
}
public void callBFS(char[][] skyMap,int i, int j){
    if(i<0 || i>=skyMap.length || j<0 || j>=skyMap[i].length || skyMap[i][j]=='0')return;
    skyMap[i][j]='0';
    callBFS(skyMap, i+1, j);
    callBFS(skyMap, i-1, j);
    callBFS(skyMap, i, j+1);
    callBFS(skyMap, i, j-1);

}
