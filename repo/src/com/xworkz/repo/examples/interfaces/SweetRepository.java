package com.xworkz.repo.examples.interfaces;

public interface SweetRepository {
	boolean create(String Sweet);
	 default int totalSweets() {
		return 0;
	}

}
