package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Snake {
	
	private String snakeName;
	private String type;
	@Autowired
	@Qualifier("colour")
	private String colour;
	@Autowired
	@Qualifier("length")
	private double length;
	private boolean poisionous;
	public Snake(String snakeName, String type, boolean poisionous) {
		super();
		this.snakeName = snakeName;
		this.type = type;
		this.poisionous = poisionous;
	}
	@Override
	public String toString() {
		return "Snake [name=" + snakeName + ", type=" + type + ", colour=" + colour + ", length=" + length + ", poisionous="
				+ poisionous + "]";
	}

}
