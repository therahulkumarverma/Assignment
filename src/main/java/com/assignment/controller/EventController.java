package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.Event;
import com.assignment.service.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService services;
	
	
	@PostMapping("/addEvent")
	public Event addEvent(@RequestBody Event event) {
		return services.saveEvent(event);
	}
	
	@PostMapping("/addEvents")
	public List<Event> addEvents(@RequestBody List<Event> events) {
		return services.saveEvents(events);
	}
	
	 @GetMapping("/events")
	    public List<Event> getAllEvents() {
	        return services.getAllEvents();
	    }
	
	 
	 @GetMapping("/event/{id}")
	 public Event getEventById(@PathVariable Long id) {
		 return services.getEventById(id).orElseThrow(() -> new RuntimeException("Event not found with ID: " + id));
	 }
	 
	 @DeleteMapping("/event/{id}")
	    public void deleteEvent(@PathVariable Long id) {
	        services.deleteEvent(id);
	    }
}
