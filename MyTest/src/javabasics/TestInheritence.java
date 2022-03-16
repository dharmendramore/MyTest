package javabasics;

class Parent {
	static void m1() {
		System.out.println("In the parent..");
	}
}

class Child extends Parent {
	static void m1() {
		System.out.println("In the Child..");
	}
}

public class TestInheritence {
	public static void main(String[] args) {
		Parent.m1();
		Child.m1();
	}
}
