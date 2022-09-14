package com.java.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Main");
		
		int x = 10;
		
		try {
			System.out.println("Start Try");
			int y = x / 2;
			int ar[] = new int[10];
			ar[50] = 10;
			System.out.println(y);
			System.out.println("End Try");
		}
		
		catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			ex.printStackTrace();
		}
		
		catch (Exception ex) {
			System.out.println("Start Catch");
			ex.printStackTrace();
			System.out.println("End Catch");
		}
		
		System.out.println(x);
		
		System.out.println("End Main");
		
	}

}
