package com.example.MerckSpringMVCSample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String empLastName;
	private String deptName;
	
	public Employee(){
		
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee(int empId, String empName, String empLastName, String deptName){
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLastName = empLastName;
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLastName=" + empLastName + ", deptName=" + deptName + "]";
	}
}
