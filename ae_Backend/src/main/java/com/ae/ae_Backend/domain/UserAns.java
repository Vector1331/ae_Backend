package com.ae.ae_Backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity(name = "user_ans")
@Getter
@Setter
@Table(name = "user_ans")
public class UserAns {
    @Id
    @GeneratedValue
    @Column(name = "user_ans_id")
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_user_id")
    private User user;

    @JsonIgnore
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "storycard_storycard_id")
    private Storycard storycard;

    private String answer;

    public static UserAns createUserAnswer(User user, Storycard storycard, String answer) {
        UserAns userAnswer = new UserAns();
        userAnswer.setUser(user);
        userAnswer.setStorycard(storycard);
        userAnswer.setAnswer(answer);
        return userAnswer;
    }
}
