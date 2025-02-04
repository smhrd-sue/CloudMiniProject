package com.smhrd.mini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smhrd.mini.entity.UserMBTI;
import com.smhrd.mini.service.FlaskService;



@Controller
public class FlaskController {
	
	@Autowired
	FlaskService flaskService;
	
	@GetMapping("/mbtiPage")
	public String inputPage() {
		System.out.println("input페이지");
		return "Input";
	}
	
	@GetMapping("/mbti")
	public String mbti(UserMBTI mbti, Model model) {
		System.out.println("mbit 받아옴");
		flaskService.predictMbti(mbti);
		model.addAttribute("mbti", mbti);
		
		return "Result";
	}

}
