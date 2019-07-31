package com.engineer.controller;

import com.engineer.entity.CalendarEvent;
import com.engineer.repositories.CalendarEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalendarEventController {

    private final CalendarEventRepository calendarEventRepository;

    @PostMapping("/addevent")
    void saveCalendarEvents(@RequestBody CalendarEvent calendarEvent) {
        calendarEventRepository.save(calendarEvent);
    }

    @GetMapping("/getevents")
    List<CalendarEvent> getCalendarEvents(){
        List<CalendarEvent> calendarEvents = calendarEventRepository.findAll();
        return calendarEvents;
    }

    @DeleteMapping("/deleteevent")
    void removeCalendarEvent(@RequestParam Long id) {
        calendarEventRepository.delete(id);
    }
}
