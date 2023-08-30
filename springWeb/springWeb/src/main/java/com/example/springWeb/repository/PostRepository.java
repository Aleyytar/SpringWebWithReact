package com.example.springWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springWeb.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
