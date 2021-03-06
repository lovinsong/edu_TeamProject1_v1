package employee.dao;

import java.util.List;

import common.model.EmployeeVO;

public interface EmployeeDao {
	
	public void insert(EmployeeVO employee);
	
	public List<EmployeeVO> searchByName(String keyword);
	
	public EmployeeVO selectOne(int empId);
	
	public void update(EmployeeVO employee);
	
	public void delete(int empId);
}
