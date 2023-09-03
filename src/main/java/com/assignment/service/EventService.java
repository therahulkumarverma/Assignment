package com.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entity.Event;
import com.assignment.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
	
	public Event saveEvent(Event event) {
		return repository.save(event);
	}
	
	public List<Event>  saveEvents(List<Event> events){
		return repository.saveAll(events);
	}
	
	public List<Event> getAllEvents(){
		return repository.findAll();
	}
	
	public Optional<Event> getEventById(Long id) {
        return repository.findById(id);
    }
	
	public void deleteEvent(Long id) {
		 repository.deleteById(id);
	}

	
}
