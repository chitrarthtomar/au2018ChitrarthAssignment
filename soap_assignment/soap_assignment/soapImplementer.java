package com.au.soaptest;

import java.util.*;
import javax.jws.WebService;

@WebService(endpointInterface = "soapAssignment.soapInterface")
public class soapImplementer implements soapIntfc{
	
	
	ArrayList<String> al = new ArrayList<String>(Arrays.asList("fdsa", "gfdsa", "ytrew"));
	
	@Override
	public String add(String name) {
		
		al.add(name);
		
		return "added "+ name + " succesfully";
	}
	
	@Override
	public String delete(String name) {
		int index = al.indexOf(name);
		al.remove(index);
		return "deleted "+ name +" succesfully";
	}
	
	@Override
	public String update(String n1, String n2) {
		int index = al.indexOf(n1);
		al.set(index, n2);
		
		
		return "update: updated "+ n1 + " with " + n2;
	}
	
	@Override
	public String get(int n) {
		return al.get(n);
		
	}
	
}
