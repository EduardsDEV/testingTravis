package com.example.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {

	@Test
	public void contextLoads() {
	}
	//a test to test welcome message
	@Test
	public void testWelcomeMsg(){
		Math m = new Math();
		String welcome = m.printHello();
		assertEquals(welcome,"HELLO THERE");
	}

	@Test
	public void testMath(){
		Math m = new Math();
		int first = m.doMath(5,8);
		assertEquals(first,13);
		int second = m.multiplyBy5(first);
		assertEquals(second,65);
	}

}
