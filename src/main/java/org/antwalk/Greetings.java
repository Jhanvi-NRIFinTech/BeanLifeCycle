package org.antwalk;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Greetings {
	//private String message;

	public void getMessage() {
		System.out.println("Hellooo!");
	}
	

//	public void setMessage(String message) {
//		this.message = message;
//	}
//	
////	@Init
//	public void init() {
//		System.out.println("Initializing the bean");
//	}
//	public void destroy() {
//		System.out.println("Destroying the bean");
//	}
//	
//	public void afterPropertiesSet() throws Exception{
//		
//	}
}
