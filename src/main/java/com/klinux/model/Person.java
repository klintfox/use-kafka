package com.klinux.model;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -4498536050211531333L;
	private String name;
	private String lastanem;
	private int age;

	public Person() {
	}

	public Person(String name, String lastanem, int age) {
		super();
		this.name = name;
		this.lastanem = lastanem;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastanem() {
		return lastanem;
	}

	public void setLastanem(String lastanem) {
		this.lastanem = lastanem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastanem=" + lastanem + ", age=" + age + "]";
	}

}