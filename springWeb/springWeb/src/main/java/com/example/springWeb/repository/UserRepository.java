package com.example.springWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springWeb.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
