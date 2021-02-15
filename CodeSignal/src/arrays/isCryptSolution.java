boolean isCryptSolution(String[] crypt, char[][] solution) {
BigInteger firstWord,secondWord,thirdWord;
for(char[] chars: solution){
    crypt[0]=crypt[0].replace(chars[0], chars[1]);
    crypt[1]=crypt[1].replace(chars[0], chars[1]);
    crypt[2]=crypt[2].replace(chars[0], chars[1]);
    System.out.println("words: " + crypt[0] + "" + crypt[1] + "" + crypt[2]); 
}
firstWord=new BigInteger(crypt[0]);
secondWord=new BigInteger(crypt[1]);
thirdWord=new BigInteger(crypt[2]);
if((crypt[0].startsWith("0") && crypt[0].length()!=1) ||
(crypt[1].startsWith("0") && crypt[1].length()!=1) ||
(crypt[2].startsWith("0") && crypt[2].length()!=1))return false;

return (firstWord.add(secondWord).equals(thirdWord));


}