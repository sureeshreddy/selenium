package moon;

public class Jupiter {
public void pharmacology(){ 
System.out.println("pharmacology executed");
}
public void chemistry(){
	System.out.println("chemistry executed");
}
public void physics(){
	System.out.println("physics executed");
}

public static void main(String args[]) {
System.out.println("pharmacy");
//Syntax to create object:class name object name = new class name
Jupiter m = new Jupiter();
m.pharmacology();
m.chemistry();
m.physics();


}
}
