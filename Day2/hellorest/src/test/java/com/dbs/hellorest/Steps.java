package com.dbs.hellorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	@Autowired
	private RestTemplate restTemplate;
	private String restURL;
	private String actualResponse;
	
	
	@Given("I have deployed the Hello REST API at {string}")
	public void i_have_deployed_the_Hello_REST_API_at(String restEndpointURL) {
		restURL = restEndpointURL;
	}

	@When("I invoke the REST API")
	public void i_invoke_the_REST_API() {
		restTemplate = new RestTemplate();
		actualResponse = restTemplate.getForObject(restURL, String.class );
	}

	@Then("I expect the response {string}")
	public void i_expect_the_response(String expectedResponse) {
		Assert.assertEquals( actualResponse, expectedResponse );
	}
}
