package com.ae.ae_Backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class StoryCard {
    @Id
    @Column(name = "storycard_id")
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "storyCard")
    private List<UserAnswer> answers = new ArrayList<>();

    private String question;
}
