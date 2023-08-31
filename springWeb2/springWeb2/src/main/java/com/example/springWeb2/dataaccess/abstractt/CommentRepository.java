package com.example.springWeb2.dataaccess.abstractt;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springWeb2.entities.concretes.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
