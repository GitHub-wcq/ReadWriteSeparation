package com.wcq.readwriteseparation.controller;


import com.wcq.readwriteseparation.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcq.readwriteseparation.service.StudentService;

import io.swagger.annotations.Api;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangchaoqun
 * @since 2020-01-14
 */
@Api
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/getInfoFromDB1")
	public String getInfoFromDB1(int id) {
		return studentService.getById(id).toString();
	}

	@PostMapping("/saveToDB1")
	public int saveToDB1(Student student){
		return studentService.saveToDB1(student);
	}
	@PostMapping("/saveToDB2")
	public int saveToDB2(Student student){
		return studentService.saveToDB2(student);
	}

	@GetMapping("/getInfoFromDB2")
	public String getInfoFromDB2(int id){
		return studentService.getInfoFromDB2(id).toString();
	}
	
}

