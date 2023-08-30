package com.example.springWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springWeb.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
