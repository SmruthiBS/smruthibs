package com.xworkz.repo.examples.interfaces;

public interface PANRepository {
	boolean create(String PANNumber);
	 default int totalSweets() {
		return 0;
	}


}
