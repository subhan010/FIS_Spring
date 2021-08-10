package com.fis.springlearn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springlearn.bean.Employee;
import com.fis.springlearn.controller.EmployeeController;
import com.sun.tools.javac.parser.ReferenceParser.ParseException;

@SpringBootApplication
public class SpringLearnApplication {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		//SpringApplication.run(SpringLearnApplication.class, args);
		
       //  displayDate();
		//displayCountry();
		//displayCounties();
		//displayEmploye();
		// getEmployeeController();
		 ApplicationContext appcontext = new AnnotationConfigApplicationContext(EmployeeController.class);
		getEmployeeControllerUsingAnnot(appcontext);
	}
	
	static void getEmployeeControllerUsingAnnot(ApplicationContext appcontext)
	{
		LOGGER.info("Start");
		EmployeeController eC=appcontext.getBean("employeeController",EmployeeController.class);
		LOGGER.debug("EmployeeController : {}" , eC);
		LOGGER.info("End");
	}
	
	static void getEmployeeController()
	{
		LOGGER.info("Start");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeController employeeController=context.getBean("controller",EmployeeController.class);
		
		
		LOGGER.debug("EmployeeController : {}" , employeeController);
		LOGGER.info("End");
		
	}
	
	static void displayEmploye()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee employe = context.getBean("employee",Employee.class );
		
		LOGGER.debug("Employee : {}" , employe.toString());
		
		
	}
	
	static void displayCounties()
	{
		LOGGER.debug("");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countries=context.getBean("countries",ArrayList.class);
		
		LOGGER.debug("Countries : {}" , countries.toString());
		
		
	}
	
	static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country",Country.class );
		Country anotherCountry =context.getBean("country",Country.class);
		LOGGER.debug("Country : {}" , country.toString());
		LOGGER.debug("Country : {}" ,anotherCountry.toString());
		
	}
	static void displayDate()
	{
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
	    SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
	    try {
	    	Date parseDate= format.parse("21/08/2019");
	    	LOGGER.debug(parseDate+ " ");
	    	//System.out.println(parseDate);
	    }
	   catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    LOGGER.info("END");

	}
}
