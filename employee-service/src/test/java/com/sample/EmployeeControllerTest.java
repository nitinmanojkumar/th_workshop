package com.sample;



import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class EmployeeControllerTest {

	private final EmployeeService empservice=mock(EmployeeService.class);
	private EmployeeController employeeController=new EmployeeController(empservice);
	
	@Test
	public void getAllEmployees() {
		
		Employee emp1=Employee.builder().name("hey").age(23).build();
		Employee emp2=Employee.builder().id((long) 55).name("hey").age(23).build();
		
		List<Employee> employeelist=new ArrayList();
		employeelist.add(emp1);
		
		when(empservice.findAllEmployees()).thenReturn(employeelist);
		
		List<Employee> employeelist1=employeeController.findAll();
		assertThat(employeelist1).isEqualTo(employeelist1);
	}
	
}
