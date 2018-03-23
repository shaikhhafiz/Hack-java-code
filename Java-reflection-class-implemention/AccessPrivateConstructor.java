package com.hafiz.reflection;
/**
 * @author Shaikh Hafiz Ahmed
 */
import java.lang.reflect.Constructor;

public class AccessPrivateConstructor {

	public static void main(final String[] args) throws Exception {
		  
		Constructor<PrivateConstructor> constructor = PrivateConstructor.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		PrivateConstructor privateConstructor = constructor.newInstance();
		privateConstructor.test();
		
	}   
}