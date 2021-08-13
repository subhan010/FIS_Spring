package com.fis.lambda;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorImpl c= new CalculatorImpl();
		System.out.println(c.operation(1, 2));
		
		Calculator cal1= new Calculator();
		{
			@Override
			public int operation(int a, int b )
			{
				return a+b;
			}
			
		};
		
		
			

	}

}
