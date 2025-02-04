package com.smhrd.mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.mini.entity.UserMBTI;
import com.smhrd.mini.respository.FlaskRepository;

@Service
public class FlaskService {
	
	@Autowired
	FlaskRepository flaskRepository;

	public void predictMbti(UserMBTI mbti) {
		flaskRepository.save(mbti);
	}
	
	

}
