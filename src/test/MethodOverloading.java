package test;

public class MethodOverloading {
	
public void add() {
	

System.out.println("pavanreddy");
}
public int add (int a, int b) {
	return a+b;
}
public int add  (int a, int b , int c) {
	return a+b+c;
}
public double add(double a,double b) {
	return a+b;
}
	
	public double add(double a, double b,double c) {
		return a+b+c;
	}
		
		public static void main(String[]arg) {
			 MethodOverloading mo =new MethodOverloading();
		mo.add();
		System.out.println(mo.add(60, 30));
		System.out.println(mo.add(10, 20,30));
		System.out.println(mo.add(3.4, 5.6, 5));
		System.out.println(mo.add(23, 56.6));
		
	}
}
	
	
	

   


