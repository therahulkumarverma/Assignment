package com.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entity.Session;
import com.assignment.repository.SessionRepository;

@Service
public class SessionService {

	@Autowired
	private SessionRepository repository;
	
	public Session saveSession(Session session) {
		return repository.save(session);
	}
	
	public Optional<Session> getSessionById(long id){
		return repository.findById(id);
	}
	
	public List<Session> getAllSession(){
		return repository.findAll();
	}
	
	public void deleteSession(long id) {
		repository.deleteById(id);
	}
}
