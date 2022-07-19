package com.demo.employeedempapp.controller;

import com.demo.employeedempapp.entity.Employee;
import com.demo.employeedempapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        return this.empService.getAllEmployee();
    }


    @RequestMapping(value = "/addemployee", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User addEmployee(@RequestBody Employee emp) {
        return this.empService.addEmployee(emp);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Employee> getAllEmployee(@PathVariable int id) {
        return this.empService.getAllEmployee(id);
    }
}
