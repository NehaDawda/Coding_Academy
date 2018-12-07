package com.jpm.collection.list;

import java.util.Comparator;

import com.jpm.collection.entity.Employee;

public class SortByEmpName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
	
}
