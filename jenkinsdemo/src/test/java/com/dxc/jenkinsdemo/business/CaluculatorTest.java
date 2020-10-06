package com.dxc.jenkinsdemo.business;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CaluculatorTest 
{
	Calculator calc=null;
	@Before
	public void setUp() throws Exception
	{
		calc=new Calculator();
	}
	@After
	public void tearDown() throws Exception
	{
		calc=null;
	}
	@Test
	public void testsum()
	{
		assertEquals(30,calc.sum(10, 20));
	}
	@Test
	public void testSqr()
	{
		assertEquals(25,calc.square(5));
	}
	@Test
	public void testPower()
	{
		assertEquals(30,calc.power(5,3));
	}
	@Test
	public void testDiv()
	{
		assertEquals(30,calc.divide(10, 5));
	}
}
