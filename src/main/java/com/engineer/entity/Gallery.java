package com.engineer.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "gallery")
@Getter
@Setter
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "teammate")
    private byte[] images;

    @Column(name="file_name")
    private String fileName;

}
