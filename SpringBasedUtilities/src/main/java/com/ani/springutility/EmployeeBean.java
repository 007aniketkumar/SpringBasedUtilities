/**
 * 
 */
package com.ani.springutility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author aniket
 *
 */
@Component
public class EmployeeBean {

	private String name;
	public String getName() {
		return name;
	}
	
	@Value("${nameofEmployee}")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	
}
