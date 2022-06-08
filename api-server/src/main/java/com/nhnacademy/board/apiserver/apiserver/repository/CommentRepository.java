package com.nhnacademy.board.apiserver.apiserver.repository;

import com.nhnacademy.board.apiserver.apiserver.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    
}
