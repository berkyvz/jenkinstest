package com.eteration.simpleapp.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eteration.simpleapp.model.Employee;
import com.eteration.simpleapp.model.Person;

@Service
public class EmployeeService {

	@Autowired
	private RestTemplate template;

	public  Employee generateRandomEmployee() {

		Employee e = new Employee();
		e.setId(0);
		ResponseEntity<Person> response = template.exchange("https://uinames.com/api/", HttpMethod.GET, null,
				new ParameterizedTypeReference<Person>() {
				});
		Person randomPerson = response.getBody();
		
		e.setSalary(new Random().nextDouble() * 3000);
		e.setGender(randomPerson.getGender());
		e.setName(randomPerson.getName());
		e.setSurname(randomPerson.getSurname());
		e.setRegion(randomPerson.getRegion());
		
		return e;

	}

}
