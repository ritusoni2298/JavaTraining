package com.thymeleafdemo.springmvc.controller;

import com.thymeleafdemo.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mvcController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
//create = post
    //read = get
    //update = put
    //delete =delete

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User usr){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user-data");
        mv.addObject("usrr",usr);
        return mv;
    }

    @GetMapping("/add/{id}")
    public String add(@PathVariable int id, Model model){
        User user = new User();
        user.setMail("ryan@gmail.com");
        user.setName("Ryan");
        user.setId(id);
        model.addAttribute("usr",user);
        return "mydetails";
    }

}
