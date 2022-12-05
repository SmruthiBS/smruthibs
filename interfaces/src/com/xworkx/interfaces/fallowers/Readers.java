package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.LibraryRule;

public class Readers implements  LibraryRule{

	@Override
	public boolean silence() {
		// TODO Auto-generated method stub
		System.out.println("running silence");
		return false;
	}

	@Override
	public boolean returnbook() {
		System.out.println("running returnbook");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sign() {
		// TODO Auto-generated method stub
		System.out.println("running sign");
		return false;
	}

	@Override
	public boolean nophone() {
		// TODO Auto-generated method stub
		System.out.println("running nophone");
		return false;
	}

	@Override
	public boolean smoking() {
		// TODO Auto-generated method stub
		System.out.println("running smoking");
		return false;
	}

}
