package com.fis.springjdbc.employee;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.fis.springjdbc.employee.IEmployee;

import com.fis.springjdbc.employee.Employee;
import com.fis.springjdbc.employee.EmployeeMapper;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployee {




	

	@Override
	public void insertEmployeet(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employee values(?,?)";
		Object[] args = { employee.getId(), employee.getName() };
		int insertedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Inserted: " + insertedRows);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String sql = "select * from employee";
		List<Employee> emp = getJdbcTemplate().query(sql, new EmployeeMapper());
		return emp;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set name=? where id=?";
		Object[] args = { employee.getName(), employee.getId() };
		int updatedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Updated: " + updatedRows);

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id=?";
		Object[] args = { id };
		int deletedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Deleted: " + deletedRows);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from employee where id=?";
		Object[] args = { id };
		Employee productById = getJdbcTemplate().queryForObject(sql, args, new EmployeeMapper());
		return productById;
	}


}
