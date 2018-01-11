package com.au.soaptest;

import javax.xml.ws.Endpoint;

public class SoapPublish {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/soapAssignment", new soapImplementer());
		
	}
}