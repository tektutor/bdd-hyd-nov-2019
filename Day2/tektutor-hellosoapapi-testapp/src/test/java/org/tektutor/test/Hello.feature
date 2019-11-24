Feature: Hello SOAP API

	Scenario: SOAP API should greet with Hello SOAP API message
	
		Given I have the Hello SOAP API up and running at endpoint URL "http://localhost:8080/Hello/services/Hello?wsdl"
		When I invoke the sayHello method
		Then I expect it to respond with message "Hello SOAP API!"