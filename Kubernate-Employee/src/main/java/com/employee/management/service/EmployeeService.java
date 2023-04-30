package com.employee.management.service;

import com.employee.management.globalexception.InValidEmployeeIDException;
import com.employee.management.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;

}

