package puzzles;

public class FindTemperatureMissingDays {

	public static void main(String[] args) {
		int x=5;int y=10;int s=40;
		findTemperature(x,y,s);

	}
static void findTemperature(int x,int y,int s) {
	double Day1,Day2;
	double diff=(x-y)*6;
	Day2=(diff+s)/2;
      Day1=s-Day2;
      System.out.println("Day1: "+Day1);
      System.out.println("Day2: "+Day2);
}
}
