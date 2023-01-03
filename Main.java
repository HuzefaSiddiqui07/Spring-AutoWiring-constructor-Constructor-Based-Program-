package com.springframework.autowiring.constructor.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("beanfactory.xml");

		BeanFactory factory = new XmlBeanFactory(resource);

		Categories categories = (Categories) factory.getBean("categories");

		categories.show(); // Call Method By Object

	}

}
