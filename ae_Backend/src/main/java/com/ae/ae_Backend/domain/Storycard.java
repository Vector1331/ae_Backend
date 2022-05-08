package com.ae.ae_Backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "storycard")
@Getter
@Table(name = "storycard")
public class Storycard {
    @Id
    @Column(name = "storycard_id")
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "storycard")
    private List<UserAns> answers = new ArrayList<>();

    private String question;
}
