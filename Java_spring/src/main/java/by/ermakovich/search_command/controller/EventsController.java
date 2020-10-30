package by.ermakovich.search_command.controller;

import by.ermakovich.search_command.entity.Events;
import by.ermakovich.search_command.service.EventsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventsController {

    private final EventsService eventsService;

    public EventsController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    @GetMapping
    public List<Events> GetAllEvents(){
        List<Events> allEvents = eventsService.findByIdGreaterThan(0);
        return  allEvents;
    }
    @PostMapping
    public Events AddEvent(Events event){
        Events Event = eventsService.addEvent(event);
        return  Event;
    }

    @PostMapping(value = "/{id}")
    public void DeleteEvent(long id){
        eventsService.deleteEvent(id);
    }
}
