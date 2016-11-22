package com.sample.main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations={"classpath:application-context.xml"})
public class Main extends AbstractTestNGSpringContextTests{

	@Autowired
	Person person;

	@Test
	public void sample() {
		person.setName("anant");
		System.out.println(person.getName());
	}
}
