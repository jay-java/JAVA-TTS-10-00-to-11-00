package core;

//same function name but having different functionalities.
//2 types 
//1.compiletime -> overloading
//2.runtime -> overriding

class Overload {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}

class Parent {
	public void show() {
		System.out.println("show function in parent");
	}
	public void fun() {
		System.out.println("fun in parent class");
	}
}

class Child extends Parent {
	public void show() {
		super.show();
		System.out.println("show function in child");
	}
	public void fun() {
		super.fun();
		System.out.println("fun in child class");
	}
}

public class P014_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		int res1 = o.add(1, 2);
		System.out.println(res1);

		int res2 = o.add(1, 2, 3);
		System.out.println(res2);
		
		Child c = new Child();
		c.show();
		c.fun();

	}
}
