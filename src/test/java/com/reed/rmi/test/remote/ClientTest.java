package com.reed.rmi.test.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reed.rmi.domain.User;
import com.reed.rmi.service.UserService;

public class ClientTest {

	private static final Logger logger = LoggerFactory
			.getLogger(ClientTest.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"client.xml");

		UserService service = (UserService) applicationContext
				.getBean("userService");
		User u = service.findById(1l);
		logger.info("============>" + u);
		logger.info("============>" + service.save(u));
	}
}