package other;

public class Person {
	public String name;		//public
	int age;				//package
	private double height;	//private
	
	
	public void showInfo() {
		String result = "%s (%d세, %.1fcm)\n";
		System.out.printf(result, name, age, height);
	}

}
