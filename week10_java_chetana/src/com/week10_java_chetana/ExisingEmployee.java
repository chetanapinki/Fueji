package com.week10_java_chetana;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ExisingEmployee {
     
	
	void exisingEmployee() {
		CreateEmplyoeeList createEmplyoeeList =new CreateEmplyoeeList();
		List<Employee>	list=createEmplyoeeList.createEmplyoeeList();
		for(Employee emp:list){
	 if(emp.getName().equalsIgnoreCase("chetana")) {
		System.out.println("name is there");
		break;
	 }
	 else {
		 System.out.println("name is not there");
		 break;
	 }
		}
	}


}
