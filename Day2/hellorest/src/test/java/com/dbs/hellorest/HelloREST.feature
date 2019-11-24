Feature: Develop a REST API in Java which greets with Hello Message

	Scenario: Invoke Hello REST API
		
			Given I have deployed the Hello REST API at "http://localhost:8085/hello?DBS"
			When I invoke the REST API
			Then I expect the response "Hello DBS!"