package com.demo.employeedempapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao empDao;

    public List<Employee> getAllEmployee() {
        return this.empDao.findAll();
    }

    public Employee addEmployee(Employee emp) {
        return this.empDao.save(emp);
    }

    public Optional<Employee> getEmployeeById(int id) {
        return this.empDao.findById(id);
    }
}
