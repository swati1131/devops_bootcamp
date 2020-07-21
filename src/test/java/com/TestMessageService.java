package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;



@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	MessageService messageService = new MessageService();
	@Test
	public void testHEllo() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void testSum() {
		System.out.println("100");
		Assertions.assertEquals(100, messageService.addition());
	}
	
	@Test
	public void testSub() {
		System.out.println("50");
		Assertions.assertEquals(50, messageService.substraction());
	}
	
	
	@Test
	public void testMul() {
		System.out.println("1875");
		Assertions.assertEquals(1875, messageService.multiplication());
	}
	
	@Test
	public void testDiv() {
		System.out.println("3");
		Assertions.assertEquals(3,messageService.division());
	}
	
	@Test
	public void testMod() {
		System.out.println("5");
		Assertions.assertEquals(5, messageService.saymod());
	}
	
	@Test
	public void testSubStr() {
		System.out.println("ops");
		Assertions.assertEquals("op", messageService.subStringofStr());
	}
	
	@Test
	public void testCompareStr() {
		System.out.println("false");
		Assertions.assertFalse(messageService.compareStr());
	}
	
	@Test
	public void testConcatStr() {
		System.out.println("devops");
		Assertions.assertEquals("devops", messageService.concatStr());
	}
	
	@Test
	public void testDisplayList() {
		System.out.println("4");
		Assertions.assertEquals(4, messageService.displayList());
	}
		
}

