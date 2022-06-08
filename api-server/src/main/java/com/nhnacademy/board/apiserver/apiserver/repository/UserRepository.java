package com.nhnacademy.board.apiserver.apiserver.repository;

import com.nhnacademy.board.apiserver.apiserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
