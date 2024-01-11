package com.week10_java_chetana;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListTheNameByDepartment {
//	List down the names of all employees in each department?
	public static void main(String[] args) {
		CreateEmplyoeeList createEmplyoeeList=new CreateEmplyoeeList();
	List<Employee>	list=createEmplyoeeList.createEmplyoeeList();
	list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
			Collectors.mapping(Employee::getName, Collectors.toList()))).entrySet().
	forEach(i->System.out.println(i));
	}
}
