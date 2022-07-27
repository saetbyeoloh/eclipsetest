package com.spring.boardweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boardweb.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
										//user라는 entity를 사용하고 아이디로는 string을 쓸거다.
	User findByUserId(String UserId);
	
	
	
}

