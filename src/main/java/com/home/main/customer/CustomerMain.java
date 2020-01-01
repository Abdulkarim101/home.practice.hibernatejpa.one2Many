package com.home.main.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.entities.AddressEntity;
import com.home.entities.CustomerEntity;
import com.home.repositories.CustomerRepository;

public class CustomerMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("practice-home.xml");
		
		CustomerRepository cr = (CustomerRepository) ac.getBean("customerRepository");
		
		CustomerEntity ct = new CustomerEntity();
		
		ct.setFirstName("John");
		ct.setLastName("Salvage");
		ct.setEmail("john@gmail.com");
		ct.setPhone(50563380);
		ct.setLastFourSsn(1268);
		ct.setGender("Male");
		ct.setDob("1980-05-06");
		
		cr.save(ct);
			
	
//	
//	AddressEntity address = new AddressEntity();
//	address.setType("Home");
//	address.setStreet1("4455 LeeHwy");
//	address.setStreet2("#444");
//	address.setCity("Arlington");
//	address.setState("Virginia");
//	address.setZipCode(22898);
//	
//	cr.save(address);
}
}