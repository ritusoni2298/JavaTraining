package com.thymeleafdemo.springmvc.service;

import com.thymeleafdemo.springmvc.entity.Employee;
import com.thymeleafdemo.springmvc.repository.EmployeeRepository;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    //dependency injection
    @Autowired
    EmployeeRepository repository;

    //read
    public List<Employee> getAllEmployees(){
        List<Employee> result = (List<Employee>) repository.findAll();
        if(result.size()>0){
            return result;
        }else{
            return new ArrayList<Employee>();
        }
    }

    //findbyid
    public Employee getEmployeeById(Long id) throws
            Exception{
        Optional<Employee> emp = repository.findById(id);
        if(emp.isPresent()){
            return emp.get();
        }else{
            throw new Exception();
        }
    }

    //post
    public Employee createOrUpdate(Employee entity){
        if(entity.getId()== null){
            entity = repository.save(entity);
            System.out.println(1);
            return entity;
        }else{
            Optional<Employee> emp = repository.findById(entity.getId());
            if(emp.isPresent()){
                Employee e = emp.get();
                e.setEmail(entity.getEmail());
                e.setFirstName(entity.getFirstName());
                e.setLastName(entity.getLastName());
                e=repository.save(e);
                System.out.println(2);
                return e;
            }else{
                System.out.println(3);
                entity = repository.save(entity);
                return entity;
            }
        }
    }


    //update
    //delete
    public void deleteEmployeeById(Long id) throws Exception{
        Optional<Employee> emp = repository.findById(id);
        if(emp.isPresent()){
            repository.deleteById(id);
        }else{
            throw new Exception("No record found");
        }
    }





}
