package com.vastika.studentinusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.studentinusa.model.Student;
import com.vastika.studentinusa.service.CollegeService;
import com.vastika.studentinusa.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private CollegeService collegeService;

	
	@RequestMapping(value = "/add_student")
	public String getAdStudentForm(Model model) {
		model.addAttribute("college",collegeService.getAllCollegeInfo());
		return "addStudent";
	}
	
	@RequestMapping(value = "/list_student")
	public String getAllUserInfo(Model model) {
		model.addAttribute("student",studentService.getAllStudentInfo());
		return "listStudent";
	}
	@RequestMapping(value = "/save_student", method=RequestMethod.POST)
	public String saveStudentInfo(@ModelAttribute Student student) {
		studentService.saveStudentInfo(student);
		return "redirect:/list_student";
	}
	
	@RequestMapping(value = "/delete_student", method = RequestMethod.GET)
	public String deleteStudentInfo(@RequestParam int id) {
		studentService.deleteStudentInfo(id);
		return "redirect:/list_student";
	}
	
	@RequestMapping(value = "/edit_student")
	public String getEditStudentForm(@RequestParam int id, Model model) {
		model.addAttribute("college",collegeService.getAllCollegeInfo());
		model.addAttribute("student",studentService.getStudentById(id));
		return "editStudent";
	}
	
	@RequestMapping(value = "/update_student", method=RequestMethod.POST)
	public String updateStudentInfo(@ModelAttribute Student student) {	
		studentService.updateStudentInfo(student);
		return "redirect:/list_student";
	}

}
