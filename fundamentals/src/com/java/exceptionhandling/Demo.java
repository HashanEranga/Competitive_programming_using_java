package com.java.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Main");
		
		int x = 10;
		
		try {
			int y = x / 0;
			System.out.println(y);
		}
		
		catch (NullPointerException ex) {
			System.out.println(ex);
		}
		
		catch (Exception ex) {
			System.out.println(ex);
		}
		
		System.out.println(x);
		
		System.out.println("End Main");
		
	}

}
