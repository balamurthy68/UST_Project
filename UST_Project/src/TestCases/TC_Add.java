package TestCases;

import Coding.calculator;

public class TC_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator mycalc = new calculator();
		
		int actualResult = calculator.add(2147483647, 20, 5);
		int expectedResult = 35;
		
		System.out.println(actualResult);
		
		
		
		if (actualResult == expectedResult )
		{
			System.out.println("Passed");
			
		}
		else
		{
			System.out.println("Fail");
			
		}	
		
	}

}
