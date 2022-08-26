package edu.kh.io.run;

import java.security.Provider.Service;

import edu.kh.io.model.service.IOService;

public class Run {

	public static void main(String[] args) {
		
		IOService service = new IOService();

		service.output();
	}

}
