package com.smhrd.mini.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.mini.entity.UserMBTI;


@Repository
public interface FlaskRepository extends JpaRepository<UserMBTI, String>{

}
