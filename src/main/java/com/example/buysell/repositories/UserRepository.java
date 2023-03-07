package com.example.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buysell.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
