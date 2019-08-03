package com.engineer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "calendar_event")
@Getter
@Setter
public class CalendarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    private Date start;

    @Column(name = "end_date")
    private Date end;

    private String title;

    @Column(name = "all_day")
    private Boolean allDay;
}
