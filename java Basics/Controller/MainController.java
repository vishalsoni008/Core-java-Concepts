package com.vishal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vishal.Dao.Repository;
import com.vishal.Model.Vishal;

@Controller
public class MainController {
	
	@Autowired
	Repository repo;
	
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	@PostMapping("/Register")
	public String Register(Vishal v) {
		repo.save(v);
		return "index";
	}
	@GetMapping("/All")
	@ResponseBody
		List<Vishal> Login(){
		return repo.findAll();
	}
	@GetMapping("/Login")
	public ModelAndView get(@RequestParam String Name) {
		ModelAndView mv=new ModelAndView("Login");
		Vishal v=repo.findById(Name).orElse(new Vishal());
		mv.addObject(v);
		return mv;
	}
}
	


