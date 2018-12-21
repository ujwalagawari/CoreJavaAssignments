package com.cg.jarfiles.jardemo;

import com.training.Person;

/**
 * Create a class called “Person” inside the package “com.training” . compile
 * it and store it in jar file. Now using this jar file, access the package
 * “com.training” and the class “Person” from other Application stored at
 * completely different location.
 * 
 * @author ugawari
 */
public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person.person("Ujwala");
	}

}
