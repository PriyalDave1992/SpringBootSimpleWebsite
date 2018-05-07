package com.coderscampus.web;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderscampus.domain.Course;
import com.coderscampus.repositories.CourseRepository;

@Controller
public class IndexController {

	@Autowired
	CourseRepository courseRepo;
	
	@RequestMapping("")
	public String index(ModelMap model)
	{
		List<Course> courses = courseRepo.findAll();
		model.put("allCourses", courses);
		return "index";
	}
	
}
