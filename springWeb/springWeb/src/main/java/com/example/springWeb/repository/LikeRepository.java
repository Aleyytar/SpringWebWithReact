package com.example.springWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springWeb.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
