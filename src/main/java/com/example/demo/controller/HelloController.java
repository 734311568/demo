/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 73431
 */
@Controller
public class HelloController {

	@RequestMapping("/yjc")
	@ResponseBody
	public String hello() {
		return "holle  中国";
	}
}
