package com.ty.userapp.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {
	@Query(value="SELECT u FROM User u WHERE u.userEmail=?1 AND u.userPassword=?2")
	User findUserByUserEmailAndUserPassword(String userEmail,String userPassword);
	
	User findUserByuserEmail(String userEmail);

}
