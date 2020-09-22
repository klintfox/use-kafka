package com.klinux.model;

import java.io.Serializable;

public class SimpleModel implements Serializable {
	private static final long serialVersionUID = 5125554126727074679L;
	private String name;
	private String lastname;

	public SimpleModel() {
	}

	public SimpleModel(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "SimpleModel [name=" + name + ", lastname=" + lastname + "]";
	}

}