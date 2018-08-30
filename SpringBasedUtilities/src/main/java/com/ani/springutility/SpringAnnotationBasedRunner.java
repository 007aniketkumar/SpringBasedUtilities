/**
 * 
 */
package com.ani.springutility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author aniket
 *
 */
public class SpringAnnotationBasedRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeBean empBean = context.getBean(EmployeeBean.class);
		empBean.setAddress("Bangalore");
		
		System.out.println(empBean.getName() + empBean.getAddress());
		
		//To check if the instance is singleton
		
		EmployeeBean empBean2 = context.getBean(EmployeeBean.class);
		
		System.out.println(empBean2.getAddress());//Same output , implying that single instance is returned.
		
		

		
	}

}
