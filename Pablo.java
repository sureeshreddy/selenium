package moon;

public class Pablo {
	int b = 30; // instance var
	static int empid = 101;
	
public void s1() {
// Pablo VV --- To Represent the data
	int a = 10; //local var
	//Non-static
	System.out.println("s1 executed");
	// int string
	System.out.println(a+"Local var");
	System.out.println(empid+"static var");
}
public void s2() {
	System.out.println("s2 executed");
	System.out.println(b + "instance var");
	System.out.println(empid+"static var");
	}
public void s3() {
	System.out.println("s3 executed");
	System.out.println(b+"instance var");
}
//static method
public static void st(){
	System.out.println("static method executed");
}

	public static void main(String args[]) {
		
System.out.println("pabloecobar");	
//Non-static : access by using object
 Pablo s = new Pablo();
 s.s1();
 s.s2();
 s.s3();
 System.out.println("===============");
 //static method : access by using classname,no need of to create any object
 Pablo.st();
}
}