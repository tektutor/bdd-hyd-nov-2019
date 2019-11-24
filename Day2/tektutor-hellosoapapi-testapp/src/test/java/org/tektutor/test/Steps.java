package org.tektutor.test;

import org.tektutor.Hello;
import org.tektutor.HelloService;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	private HelloService helloService;
	private Hello hello;
	private String actualResponse;
	
	@Given("I have the Hello SOAP API up and running at endpoint URL {string}")
	public void createHelloSOAPServiceObject(String endpointURL) {
		helloService = new HelloService();
		hello = helloService.getHello();
	}
	
	@When("I invoke the sayHello method")
	public void invokeSOAPAPI() {
		actualResponse = hello.sayHello();
	}
	
	@Then("I expect it to respond with message {string}")
	public void verifyResponse(String expectedResponse) {
		Assert.assertEquals(actualResponse, expectedResponse);	
	}

}
