package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.Session;
import com.assignment.service.SessionService;

@RestController
public class SessionController {

	@Autowired
	private SessionService service;
	
	
	@PostMapping("/addSession")
	public Session addSession(@RequestBody Session session) {
		return service.saveSession(session);
	}
	
	@GetMapping("/sessions")
	public List<Session> getAllSessions(){
		return service.getAllSession();
	}
	
	@GetMapping("/session/{id}")
	public Session getSessionById(@PathVariable Long id) {
		return service.getSessionById(id).orElseThrow(() -> new RuntimeException("Event not found with ID: " + id));
	}
	
	@DeleteMapping("/session/{id}")
	public void deleteSession(@PathVariable Long id) {
		service.deleteSession(id);
	}
	
	
}
