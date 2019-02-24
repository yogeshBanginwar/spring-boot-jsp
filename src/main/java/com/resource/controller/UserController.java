package com.resource.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.resource.model.Interview;
import com.resource.model.Login;
import com.resource.model.User;
import com.resource.repository.InterviewRepository;
import com.resource.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	InterviewRepository interviewRepository;

	@GetMapping("/home")
	public String homePage(Model model) {
		return "login";
	}

	@GetMapping("/register")
	public String viewPage(Model model, @RequestParam(value = "id", required = false) Integer id) {
		User user = new User();
		if (id != null) {
			user = userRepository.findById(id).get();
		}
		model.addAttribute("Form", user);

		return "register";
	}

	@PostMapping("/login")
	public String login(Model model, @ModelAttribute Login login) {
		if (login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
			return "register";
		} else {
			return "redirect:/home";
		}
	}

	@PostMapping("/save")
	public String registerSave(Model model, @ModelAttribute User user) {
		userRepository.save(user);
		model.addAttribute("success", "Object Save");
		return "redirect:/register";
	}

	@ModelAttribute("userlist")
	public List<User> studentDisplay(Model model) {
		List<User> list = userRepository.findAll();
		return list;
	}

	@GetMapping("deleteUser")
	public String deleteUser(@RequestParam("id") Integer integer) {
		userRepository.deleteById(integer);
		return "redirect:/register";
	}

	/*
	 * @GetMapping("editUser") public String editUser(Model
	 * model, @RequestParam("id") Integer id, @ModelAttribute User user) {
	 * System.out.println(id); userRepository.save(user); return
	 * "redirect:/register"; }
	 */
	@GetMapping("/interview")
	public String viewInterviewPage(Model model, @RequestParam(value = "id", required = false) Integer id) {
		Interview interview = new Interview();
		if (id != null) {
			interview = interviewRepository.findById(id).get();
		}
		model.addAttribute("interviewForm", interview);

		return "interview";
	}

	@ModelAttribute("interviewlist")
	public List<Interview> studentDisplay() {
		List<Interview> list = interviewRepository.findAll();
		return list;
	}

	@PostMapping("/saveInterview")
	public String interviewerSave(Model model, @ModelAttribute Interview interview) {
		interviewRepository.save(interview);
		return "redirect:/interview"; 
	}
	
}
