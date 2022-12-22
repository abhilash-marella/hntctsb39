package com.demo.d_03;
import java.util.function.BiFunction;
import java.util.function.Supplier;

class Student{
	private String name;
	private int roll;
	
	public Student() {}

	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}

public class ReferenceDemo02 {
	public static void main(String[] args) {
//		no input, get Object
		Supplier<Student> sup1 = ()->{return new Student();};
		Supplier<Student> sup2 = Student::new;

//		2 inputs and 1 output
		BiFunction<String,Integer,Student> biFunc1 = (n, r)->{return new Student(n, r);};
		BiFunction<String,Integer,Student> biFunc2 = Student::new;
	}
}
