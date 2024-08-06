package moon;
class C {
	int a = 40;
	int b = 50;
	public void m1() {
		System.out.println("M1 executed");
	}

}
class B extends C{
	int x =20;
	int y =30;
	public void m2() {
		System.out.println("M2 executed");
		System.out.println(a +b);
		
		
	}
}
 public class C extends B {
	public void m3() {
		System.out.println("M3 executed");
		System.out.println(x+y);//class B
		System.out.println(a+b);//class A
		
	}

public static void main (String args[]) {
	C obj = new C();
	obj.m1();
	obj.m2();
	obj.m3();
}
}
	
