package com.fis.springlearn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.tools.javac.parser.ReferenceParser.ParseException;

@SpringBootApplication
public class SpringLearnApplication {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
       //  displayDate();
		//displayCountry();
		displayCounties();
		 
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
