package com.fis.springlearn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.SpringLearnApplication;

public class Skills {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	int id;
	String name;
	public Skills()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + "]";
	}
	
	

}
