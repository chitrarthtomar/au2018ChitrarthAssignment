package com.au.soaptest;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public interface soapIntfc {
	
	@WebMethod
	String add(String name);
	
	@WebMethod
	String delete(String name);
	
	@WebMethod
	String update(String n1, String n2);
	
	@WebMethod
	public String get(int n);
}
