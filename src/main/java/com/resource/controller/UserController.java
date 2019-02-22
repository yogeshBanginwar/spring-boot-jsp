package com.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.resource.model.Login;
import com.resource.model.User;
import com.resource.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	@GetMapping("/home")
	public String homePage( Model model ,@ModelAttribute Login login) {
		login =new Login();
		return "login";
	}
	
	@PostMapping("/login")
	public String login( Model model, @ModelAttribute Login login,BindingResult bindingResult ) {
		if(login.getUsername().equals("admin")&& login.getPassword().equals("admin")) {
		return "register";
	}
		else {
			return "redirect:/home";
		}
	}

	@GetMapping("/register")
	public String viewPage() {
		return "register";
	}

	@PostMapping("/save")
	public String registerSave(Model model, @ModelAttribute User user, BindingResult bindingResult) {
		System.out.println();
		System.out.println("save");
		userRepository.save(user);
		model.addAttribute("userlist", userRepository.findAll());
		System.out.println(userRepository.findAll());
		return "redirect:/register";
	}

	@ModelAttribute("userlist")
	public List<User> studentDisplay(Model model) {
		List<User> list = userRepository.findAll();
		return list;
	}

}
