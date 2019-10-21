package com.thymeleafdemo.springmvc.controller;

import com.thymeleafdemo.springmvc.entity.Employee;
import com.thymeleafdemo.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @RequestMapping("/")
    public String getallemp(Model model){
        List<Employee> ls = service.getAllEmployees();
        model.addAttribute("employees",ls);
        return "list";
    }

    @RequestMapping(path="/createEmployee",method = RequestMethod.POST)
    public String createOrUpdate(Employee emp){
        service.createOrUpdate(emp);
        return "redirect:/";
    }

    @RequestMapping(path = {"/edit","/edit/{id}"})
    public String getEmployeeById(Model model, @PathVariable("id") Optional<Long> idop) throws Exception{
        if(idop.isPresent()){
            Employee emp = service.getEmployeeById(idop.get());
            model.addAttribute("employee",emp);
        }else{
            model.addAttribute("employee",new Employee());
        }
        return "add-edit";
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) throws Exception{
        service.deleteEmployeeById(id);
        return "redirect:/";
    }



}
