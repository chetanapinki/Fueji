package com.week10_java_chetana;

import java.lang.StackWalker.Option;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfGenderInSalesMarketing {
	public static void main(String[] args) {
		CreateEmplyoeeList createEmplyoeeList=new CreateEmplyoeeList();
	List<Employee>	list=createEmplyoeeList.createEmplyoeeList();
//	Number of male and female employees are there in the sales and marketing department?
	Map<String, Map<String, Long>> map =list.stream().
	filter(i->i.getDepartment().equalsIgnoreCase("sales")||i.getDepartment().equalsIgnoreCase("marketing"))
	.collect(Collectors.groupingBy(Employee::getDepartment,
			Collectors.groupingBy(Employee::getGender,Collectors.counting())));
	System.out.println(map);
	}
}
