package controller;

import com.ems.employeemanagement.model.Employee;
import com.ems.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeAPI {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/get")
    public Employee save(){
        Employee employee = new Employee();
        employee.setEmail("rudra@gmail");
        employee.setFirstName("Ram");
        employee.setLastName("Vijay");
        employee.setId(2);
        employeeRepository.save(employee);
        return employee;
    }

}
