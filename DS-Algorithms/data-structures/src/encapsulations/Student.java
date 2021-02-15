package encapsulations;

public class Student {
    private int age;
    private String name;
    public int getAge() {
    	return age;
    }
    public void setAge(int age){
    	if(age>20) {
    		System.out.print("You are too old to be in our nursery school");
    	}else {
    	this.age=age;
    }
}
}