package com.ey.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import com.ey.entity.Department;
import com.ey.entity.Employee;



public class EmpDeptDao {

	private EntityManagerFactory factory;
	
	public EmpDeptDao() {

		factory = Persistence.createEntityManagerFactory("MyJPA");
		
	}
	
	public int addDept(Department d) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(d);
		txn.commit();
		em.close();
		return d.getDeptNo();
	}
	
	public int addEmp(Employee e, int deptNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
	    Department d = em.find(Department.class, deptNo);
	    e.setDept(d);
	    em.persist(e);
	    txn.commit();
	    em.close();
	    return e.getEmpNo();
	}
	
	public void removeDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Department d = em.find(Department.class, deptNo);
		em.remove(d);
		txn.commit();
		em.close();
	}
	
	public Department findDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		Department d = em.find(Department.class, deptNo);
		return d;
	}
	
	public Employee findEmp(int empNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Employee.class, empNo);
	}
	
	public List<Employee> listEmp(){
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Employee");
		return que.getResultList();
	}
}
