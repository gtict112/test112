package com.example.fristhhello;

import java.io.Serializable;

public class person implements Serializable {
	private String name;
	private int age;
	public String getname()
	{
		return name;
	}
	public void setname(String name )
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setage(int age)
	{
		this.age = age;
	}
}
