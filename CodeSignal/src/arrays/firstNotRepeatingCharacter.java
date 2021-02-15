package arrays;
char firstNotRepeatingCharacter(String s) {
int i=0;
int repeated=0;
int j=0;

for( i=0;i<s.length();i++){
    repeated=0;
    for(j=0;j<s.length();j++){
        if(i!=j && s.charAt(i)==s.charAt(j)){
            repeated=1;
            break;
        }
    }
    if(repeated==0){
        return s.charAt(i);
    }
}
return '_';
}
