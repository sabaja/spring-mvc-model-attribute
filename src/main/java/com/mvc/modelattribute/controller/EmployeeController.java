package com.mvc.modelattribute.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.modelattribute.domain.Employee;

@Controller
@RequestMapping("/spring-mvc-java")
public class EmployeeController {

	@GetMapping("/employee")
	public ModelAndView showForm() {
		return new ModelAndView("employee", "employee", new Employee());
	}

	@PostMapping("/addEmployee")
	public String submit(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("name", employee.getName());
		model.addAttribute("id", employee.getId());
		model.addAttribute("contactNumber", employee.getContactNumber());
		return "employee";
	}
}
