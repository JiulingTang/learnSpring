package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import pack1.IjserviceIml;

public class Test1 {

	ClassPathXmlApplicationContext ctx;
	@Test
	public void test() throws IOException {
		IjserviceIml iml=(IjserviceIml)ctx.getBean("ijService");
		iml.save();
		//System.out.println(ctx.getResource("url:http://www.indeed.ca/").contentLength());
	}
	
	@Before
	public void before(){
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		
		
	}
}
