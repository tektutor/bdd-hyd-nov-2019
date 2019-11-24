package org.tektutor;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	
	@WebMethod
	public String sayHello() {
		return "Hello SOAP API!";
	}

}
