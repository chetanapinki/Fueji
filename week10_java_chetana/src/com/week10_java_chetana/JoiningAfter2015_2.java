package com.week10_java_chetana;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningAfter2015_2 {
	public static void main(String[] args) {
		CreateEmplyoeeList createEmplyoeeList=new CreateEmplyoeeList();
	List<Employee>	list=createEmplyoeeList.createEmplyoeeList();
	list.stream().filter(i->i.getYearOfJoining()>2015).map(i->i.getName()).forEach(i->System.out.println(i));

	}
}
