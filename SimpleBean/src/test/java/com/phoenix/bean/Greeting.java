package com.phoenix.bean;

/*
 * @author: vikas.prajapati@stltech.in
 * @version 1.0
 * @Date 28-07-2021
 * @copyright Sterlite technology Ltd.
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//bean classs of spring
@Component
public class Greeting {

	@Value("Happy BirthDay!")
	private String message;

	public Greeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Greeting object is created");
	}

	public String greet() {
		return message;
	}
}
