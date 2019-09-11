package com.wuyafan.test;

import java.util.Date;

import org.junit.Test;

import com.wuyafan.controller.WebController;
import com.wuyafan.utils.StringUtils;

public class TestDeom {

	@Test
	public void testInit() {
		String news[]= {"bdusdbasudsaohdsaodsab"};
		for (String string : news) {
			
		}
		StringUtils.getPartString("");
	}
	
	@Test
	public void getAge(Date src) {
		int age = WebController.getAge("2019-05-04");
		System.out.println("age");
	}
	
	@Test
	public void getDateByMonthInit (Date src) {
		int age = WebController.getDateByMonthInit("2019-05-04");
		System.out.println("age");
	}
	
	@Test
	public void getDateByMonthLast(Date src) {
		int age = WebController.getDateByMonthLast("2019-05-04");
		System.out.println("age");
	}
	
	@Test
	public void getDaysByFuture (Date src) {
		int age = WebController.getDaysByFuture("2019-05-04");
		System.out.println("age");
	}
	
	@Test
	public void getDaysByDeparted (Date src) {
		int age = WebController.getDaysByDeparted("2019-05-04");
		System.out.println("age");
	}
}
