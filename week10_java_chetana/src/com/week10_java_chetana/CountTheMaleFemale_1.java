package com.week10_java_chetana;

import java.util.List;
import java.util.stream.Collectors;

public class CountTheMaleFemale_1  {
	
public static void main(String[] args) {
	CreateEmplyoeeList createEmplyoeeList=new CreateEmplyoeeList();
List<Employee>	list=createEmplyoeeList.createEmplyoeeList();
list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().
forEach(i->System.out.println(i));

}
}
