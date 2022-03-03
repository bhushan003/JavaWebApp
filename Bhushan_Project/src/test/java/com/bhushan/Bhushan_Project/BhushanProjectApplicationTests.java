package com.bhushan.Bhushan_Project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BhushanProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	Calculator calc = new Calculator();

	@Test
	void testSum() {

		int expectedResult = 6;

		int actualResult = calc.doSum(1, 2, 3);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	public void testProduct() {

		int expectedResult = 12;

		int actualResult = calc.doProduct(3, 4);

		// assertThat(actualResult).isEqualTo(expectedResult);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	// @Disabled
	public void testCompareNum() {

		boolean actualResult = calc.compareNum(2, 2);
		System.out.println(actualResult);
		// assertThat(actualResult).isTrue();
		assertTrue(actualResult);
	}

	@Test
	public void testListMokito() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10);
		assertEquals(10, mockList.size());
		
		when(mockList.get(0)).thenReturn("someString");
		assertEquals("someString", mockList.get(0));

	}

}
