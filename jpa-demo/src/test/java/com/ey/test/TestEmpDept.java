package com.ey.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.dao.EmpDeptDao;
import com.ey.entity.Department;
import com.ey.entity.Employee;

public class TestEmpDept {

	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDeptNo(20);
		dept.setDeptName("Accounts");
		dao.addDept(dept);
	}
	
	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpNo(203);
		emp.setEmpName("Patek");
		emp.setSalary(4500);
		dao.addEmp(emp,20);
	}
	
	@Test
	public void testFindDept() {
		Department dept = dao.findDept(10);
		System.out.println(dept);
		dept.getEmps().forEach(System.out::println);
	}
	
	@Test
	public void testRemoveDept() {
		dao.removeDept(20);
	}
	
//	public void testFindEmp() {
//		
//		Employee emp = dao.findEmp(102);
//	    System.out.println(emp);
//	    emp.getEmps().forEach(System.out::println);
//		
//	}
}
