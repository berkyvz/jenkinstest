package com.eteration.simpleapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.assertj.core.api.Assertions.assertThat;

import com.eteration.simpleapp.controller.EmployeeController;
import com.eteration.simpleapp.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SimpleappApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	@Autowired
	private EmployeeController employeeController;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(employeeController).isNotNull();
	}
	

	@Test
	public void testModelEmployee() {
		Employee e1 = new Employee();
		e1.setGender("");
		e1.setId(0);
		e1.setName("");
		e1.setRegion("");
		e1.setSalary(111.1);
		e1.setSurname("");
		
		Employee e2 = new Employee(0, "", "", "", "", 111.1);
		
		assertThat(e1.toString()).isEqualTo(e2.toString());
	}
	
	@Test
	public void testEmployeeController() throws Exception {
		this.mockMvc.perform(get("/employee")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentTypeCompatibleWith("application/json"));
		
	}

}
