package com.employee.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {
	
private Calculator c=new Calculator();
	@Test
	void contextLoads() {
		
	}
	@Test
	void testSum() {
		
		int exResult=40;
		int actResult = c.doSum(12, 20, 8);
		assertThat(exResult).isEqualTo(actResult);
	}
	@Test
	void testProduct() {
		int exp=20;
		int act=c.doProduct(10,2);
		assertThat(exp).isEqualTo(exp);
	}
	@Test
	void testCompareNums() {
		boolean actual = c.compareNum(10, 10);
		assertThat(actual).isTrue();
	}

}
