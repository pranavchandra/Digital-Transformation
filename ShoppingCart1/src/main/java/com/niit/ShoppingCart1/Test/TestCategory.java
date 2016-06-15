package com.niit.ShoppingCart1.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCart1.bean.Category;

public class TestCategory {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); 
		context.scan("com.niit.shoppingcart1.bean");
		context.refresh();
		
		Category p = (Category) context.getBean("category");
		p.setId("007");
		p.setName("Pranav");
		p.setDescription("He is an avid reader");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDescription());
		
		if (p==null){
			System.out.println("Unable to get category object");
		}
		else{
			System.out.println("Category object is created");
		}
	}

}
