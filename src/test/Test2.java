package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.Store;
import pack1.Store1;

public class Test2 {
	
	ClassPathXmlApplicationContext ctx;
	@Test
	public void test() {
		Store s=(Store) ctx.getBean("store");
		s.save();
	}

	@Before
	public void before(){
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		
		
	}
}
