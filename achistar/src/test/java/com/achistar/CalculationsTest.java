package com.achistar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculationsTest {

	Calculations calculations=new Calculations();
	
	@Test
	public void addTest() {
		double a=2;
		double b=7;
		boolean status=false;
		if(calculations.add(a,b)==a+b)
		{
			System.out.println(calculations.add(a, b));
			status=true;
		}
		assertTrue(status);
	}
	
	@Test
	public void mulTest() {
		double a=2;
		double b=7;
		boolean status=false;
		if(calculations.mul(a,b)==a*b)
		{
			System.out.println(calculations.mul(a, b));
			status=true;
		}
		assertTrue(status);
	}
	
	@Test
	public void subTest() {
		double a=2;
		double b=7;
		boolean status=false;
		if(calculations.sub(a,b)==a-b)
		{
			System.out.println(calculations.sub(a, b));
			status=true;
		}
		assertTrue(status);
		
	}
	
	@Test
	public void divTest() {
		double a=2;
		double b=7;
		boolean status=false;
		if(calculations.div(a,b)==a/b)
		{
			System.out.println(calculations.div(a, b));
			status=true;
		}
		assertTrue(status);
	}
	
}
