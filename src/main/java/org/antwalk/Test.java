package org.antwalk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("mybeans.xml");
//		Greetings greet =(Greetings)context.getBean("greeting");
//		greet.getMessage();
//		context.registerShutdownHook();
		
		String path="C:\\Users\\JHANVIM\\Desktop\\BeanLifeCycleApp\\src\\main\\resources\\mybeans.xml";
		ApplicationContext context=new FileSystemXmlApplicationContext(path);
		Greetings greet =(Greetings)context.getBean(Greetings.class);
		greet.getMessage();
		
		Author auth1=context.getBean("web",Author.class);
		Author auth2=context.getBean("paper",Author.class);
		greet.getMessage();
		System.out.println(auth1.write());
		System.out.println(auth2.write());
		
		
		
	}
}
