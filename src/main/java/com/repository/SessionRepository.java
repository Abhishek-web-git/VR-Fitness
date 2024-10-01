package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

}
