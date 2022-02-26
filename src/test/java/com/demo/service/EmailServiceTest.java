package com.demo.service;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Test;
import com.demo.domain.Order;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
// @RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
  public EmailServiceTest() {
		// TODO Auto-generated constructor stub
	}

	EmailService emailService;

	@Before
	public void init() {
		emailService = new EmailService();
	}

	@Test
	public void testGetInstance() {
		try {
			EmailService myReturnedObject = EmailService.getInstance();
			// check if the object is != null
			assertNotNull(myReturnedObject);
			// check if the returned object is of class Expression.
			assertTrue(myReturnedObject instanceof EmailService);
		} catch (Exception e) {
			// TODO: handle exception
			// let the test fail, if your function throws an Exception.
			fail("got Exception, i want an EmailService");
			System.out.println(e);
		}
	}

	@Test
	public void testSendEmail_BooleanTrue() {
		assertTrue(emailService.sendEmail(new Order(), "abc"));
		// System.out.println("assertTrue");
	}

	@After
	public void tearDown() {
		emailService = null;
		// System.out.println(emailService);
	}
}
