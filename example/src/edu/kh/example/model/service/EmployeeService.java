package edu.kh.example.model.service;


import java.util.ArrayList;
import java.util.List;

import edu.kh.example.model.vo.Employee;

public class EmployeeService {

	private List<Employee> empList = new ArrayList<Employee>();

	/**
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param jobName
	 * @param salary
	 * @return
	 * true : 사원 정보 추가 성공 시
	 * false : 사원 정보 추가 실패 시
	 */
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone, 
			String departmentTitle, String jobName, int salary) {
		
		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		
		return empList.add(emp);
	}

	/**
	 * @return empList
	 */
	public List<Employee> getEmpList() {
		
		return empList;
	}

	
	public List<Employee> selectEmployee(int id){
		List<Employee> resultList = new ArrayList<Employee>();
		
		for( Employee e : empList ) {
			
			if(e.getEmpId() == id ) {
				resultList.add(e);
			}
		}
		
		return resultList;
	}
	
	
	/**
	 * @param id
	 * @param departmentTitle
	 * @param jobName
	 * @return 
	 */
	public boolean updateEmployee(int id, String departmentTitle, String jobName) {
		
		List<Employee> resultList = new ArrayList<Employee>();
		
		for( Employee e : empList ) {
			
			if(e.getEmpId() != id ) {
				return false;
			} else {
				empList.get(id).setDepartmentTitle(departmentTitle);
				empList.get(id).setJobName(jobName);
				
				return true;
			}
		}
		return false;
		

	}
	
	
	
}
