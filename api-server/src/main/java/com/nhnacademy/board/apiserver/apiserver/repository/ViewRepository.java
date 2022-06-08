package com.nhnacademy.board.apiserver.apiserver.repository;

import com.nhnacademy.board.apiserver.apiserver.entity.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewRepository extends JpaRepository<View, View.Pk> {

}
