package com.engineer.entity;

import com.engineer.common.LocalDateAttributeConverter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "calendar_event")
@Getter
@Setter
public class CalendarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Convert(converter = LocalDateAttributeConverter.class)
    @Column(name = "start_date")
    private Date start;

    //    @Convert(converter = LocalDateAttributeConverter.class)
    @Column(name = "end_date")
    private Date end;

    private String title;

    @Column(name = "all_day")
    private Boolean allDay;
}
