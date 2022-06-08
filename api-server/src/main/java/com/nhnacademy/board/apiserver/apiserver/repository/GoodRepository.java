package com.nhnacademy.board.apiserver.apiserver.repository;

import com.nhnacademy.board.apiserver.apiserver.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<Good, Integer> {

}
