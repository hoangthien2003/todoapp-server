package com.baothien.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.baothien.server.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT * FROM User")
	List<User> getAllUsers();
}
