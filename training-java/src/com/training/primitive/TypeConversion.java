package com.training.primitive;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		System.out.println(b);
		System.out.println(s);
		s = b;
		System.out.println(s);
		s = (byte) b;
		System.out.println(b);

	}

}
