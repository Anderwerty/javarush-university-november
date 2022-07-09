package com.javarush.module1.lesson7;

import java.sql.Connection;
import java.util.List;

public class Example9 {
}

class Employee {

}

interface EmployeeRepository {

    List<Employee> findAll(Connection connection);
}

class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> findAll(Connection connection) {
        //custom employee repository
        return null;
    }
}

class EmployeeRepositoryWithCache implements EmployeeRepository {


    private final EmployeeRepository employeeRepository;
    private List<Employee> cache;

    EmployeeRepositoryWithCache(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public synchronized List<Employee> findAll(Connection connection) {
        if (cache == null){
            cache = employeeRepository.findAll(connection);
        }

        return cache;
    }
}