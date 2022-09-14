package com.java.advancedexceptions;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Main");
		new A().mA();
		System.out.println("End Main");
	}
}

class A {
	void mA() {
		System.out.println("B method Start");
		new B().mB();
		System.out.println("B method End");
	}
}

class B {
	void mB() {
		System.out.println("B method Start");
		new C().mC();
		System.out.println("B method End");
	}
}

class C {
	void mC() {
		System.out.println("C method Start");
		int y = 10/0;
		System.out.println("C method End");
	}
}
