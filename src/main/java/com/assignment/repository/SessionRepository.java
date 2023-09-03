package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.entity.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
