package com.nhnacademy.board.apiserver.apiserver.repository;

import com.nhnacademy.board.apiserver.apiserver.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
