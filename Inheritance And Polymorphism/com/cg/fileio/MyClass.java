package com.cg.fileio;
import java.io.Serializable;

/**
 * create a class "MyClass". create 5 different objects of it. add them in an
 * arraylist. store arraylist in file. Now open a file, read arraylist and
 * display all objects.
 *  HINT:- Use Serialization and Desrialization with Collection
 * 
 * @author ugawari
 */
public class MyClass implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	

}
