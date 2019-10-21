package com.thymeleafdemo.springmvc.controller;

import com.thymeleafdemo.springmvc.entity.Employee;
import com.thymeleafdemo.springmvc.repository.EmployeeRepository;
import com.thymeleafdemo.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RestControllerClass {
    @Autowired
    EmployeeService service;

    @Autowired
    EmployeeRepository repo;


    //GET
    @GetMapping("/")
    public List<Employee> getallemp(){
        List<Employee> ls = service.getAllEmployees();
//        model.addAttribute("employees",ls);
        return ls;
    }

    //POST
    @PostMapping(path="/createEmployee")
    public Employee createOrUpdate(@Valid @RequestBody Employee emp){
        service.createOrUpdate(emp);
        return emp;
    }

    @PutMapping(path = {"/edit/{id}"})
    public Employee getEmployeeById( @PathVariable("id") Optional<Long> idop, @Valid @RequestBody Employee emp) throws Exception{
        if(idop.isPresent()){

            Employee emp1 = service.getEmployeeById(idop.get());
//        Optional<Employee> emp2 = service.getEmployeeById(entity.getId());
//        if(emp1.isPresent()){
//            Employee e = emp.get();
            emp1.setEmail(emp.getEmail());
            emp1.setFirstName(emp.getFirstName());
            emp1.setLastName(emp.getLastName());
            emp1=service.createOrUpdate(emp1);
            System.out.println(2);
            return emp1;
        }else{
            throw new Exception("no record");
        }

    }
    //curl
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception{
        service.deleteEmployeeById(id);
        return ResponseEntity.ok().build();
    }
}
