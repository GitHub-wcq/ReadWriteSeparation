package com.wcq.readwriteseparation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(value = "/getInfo")
	public String getInfo(int id) {
		return studentService.getById(id).toString();
	}
	
}

