package com.au2018.EmployeeDataForum;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      
        EmployeeDao dao=(EmployeeDao)context.getBean("edao");  
//        int status=dao.addEmployee(new Employee(102,"Amit",35));  
//        System.out.println(status);
        
        List<Employee> list=dao.getAllEmployeesRowMapper();  
        for(Employee e:list)  
            System.out.println(e.getEname()); 
        
        List<Employee> eList = new ArrayList<Employee>();
        Employee e1= new Employee(5,"arvind",25);
        Employee e2= new Employee(6,"ravind",23);
        Employee e3= new Employee(9,"darvinr",36);
        
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        
        dao.insertBatch(eList);
        
        
    }
}
