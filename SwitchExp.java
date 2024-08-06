package moon;
import java.util.Scanner;

public class SwitchExp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter  second number");
		int b =sc.nextInt();
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
		System.out.println(a+b);
		break;
		case 2:
		System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
			default:
				System.out.println("invalid choice");
	
		}
		---------------------------------------------
		class A{
			public void test() {
				System.out.println("Hai...");
				System.out.println("parent class");
			}
		}
		 class B extends A {
			public static void main(String[]args) {
				 B s= new B();
				 s. test();
				 }
		
		}

				
		
	}

}
