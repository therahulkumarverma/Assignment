package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.entity.Event;

public interface EventRepository  extends JpaRepository<Event , Long>{

}
