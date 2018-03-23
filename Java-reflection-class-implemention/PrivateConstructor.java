package com.hafiz.reflection;
/**
 * @author Shaikh Hafiz Ahmed
 */
public class PrivateConstructor {
	private PrivateConstructor(){
		System.out.println("Private constructor is invoked");
	}
	public void test(){
		System.out.println("Method is invoked via object created using java reflection class");
	}
}
