package com.ssafy.muscle_maker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Tag {
    @Id @ GeneratedValue
    @Column(name = "tag_id")
    Long id;


    @Column(unique = true)
    String tag;


}

