package com.smhrd.mini.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserMBTI {

	@Id
	private String id;
	private String choice;
	private String mbti;
}
