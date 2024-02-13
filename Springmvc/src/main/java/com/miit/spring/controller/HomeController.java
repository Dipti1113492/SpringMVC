package com.miit.spring.controller;
import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;      
import org.springframework.web.bind.annotation.RequestMapping;

import com.miit.spring.model.RegisterDao1;
import com.miit.spring.model.User;    
@Controller    
public class HomeController {    
    @Autowired    
    RegisterDao1 dao;//will inject dao from XML file    
        
    /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */    
    @RequestMapping("/empform")    
    public String showform(Model m){    
        m.addAttribute("command", new User());  
        return "empform";   
    }    
    /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/    
//    @RequestMapping(value="/save",method = RequestMethod.POST)    
//    public String save(@ModelAttribute("emp") User emp){    
//        dao.save(emp);    
//        return "redirect:/viewemp";//will redirect to viewemp request mapping    
//    }    
//    /* It provides list of employees in model object */    
//    @RequestMapping("/viewemp")    
//    public String viewemp(Model m){    
//        List<User> list=dao.getEmployees();    
//        m.addAttribute("list",list);  
//        return "viewemp";    
//    }    
//    /* It displays object data into form for the given id.   
//     * The @PathVariable puts URL data into variable.*/    
//    @RequestMapping(value="/editemp/{id}")    
//    public String edit(@PathVariable int id, Model m){    
//        User emp=dao.getEmpById(id);    
//        m.addAttribute("command",emp);  
//        return "empeditform";    
//    }    
//    /* It updates model object. */    
//    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
//    public String editsave(@ModelAttribute("emp") User emp){    
//        dao.update(emp);    
//        return "redirect:/viewemp";    
//    }    
//    /* It deletes record for the given id in URL and redirects to /viewemp */    
//    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
//    public String delete(@PathVariable int id){    
//        dao.delete(id);    
//        return "redirect:/viewemp";    
//    }
    
	@RequestMapping(value = "/fetch")

	 public String viewemp(Model m){    
	        List<User> listEmp=dao.getEmployees();    
	        m.addAttribute("listEmp",listEmp);  
	        return "index";    
	    }    
  }
