package com.fis.springjdbc.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springjdbc.product.Product;
import com.fis.springjdbc.product.ProductDAOImpl;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoexample.xml");
		EmployeeDAOImpl bean = context.getBean("employeeDao", EmployeeDAOImpl.class);

		System.out.println("===============================");
		System.out.println("Insert a Employee");
		Employee newProduct = new Employee();
		newProduct.setId(30);
		newProduct.setName("Rakeshr");
		bean.insertEmployeet(newProduct);
		System.out.println("===============================");
		System.out.println("Delete Employeet");
		int id = 10;
		bean.deleteEmployee(id);
		System.out.println("===============================");
		System.out.println("Get Employee Based on Id");
		id = 200;
		Employee productById = bean.getEmployeeById(id);
		System.out.println(productById);
		System.out.println("===============================");
		System.out.println("Update Employee");
		newProduct = new Employee();
		newProduct.setId(30);
		newProduct.setName("Ravi");
		bean.updateEmployee(newProduct);
		System.out.println("===============================");
		System.out.println("Get All Employee");
		System.out.println(bean.getAllEmployee());
		System.out.println("===============================");

		context.close();

	}

}
