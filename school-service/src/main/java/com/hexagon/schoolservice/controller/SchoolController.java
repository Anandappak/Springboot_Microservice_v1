package com.hexagon.schoolservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping(value = "/school")
@RestController
public class SchoolController {

	@GetMapping("/id/{id}")
	public String fetchSchoolById(@PathVariable int id) {
		return "School Services Call";
	}
}
