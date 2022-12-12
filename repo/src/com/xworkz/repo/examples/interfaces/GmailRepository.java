package com.xworkz.repo.examples.interfaces;

public interface GmailRepository {
	boolean create(String gmail);
	 default int totalGmails() {
		return 0;
	}
	

}
