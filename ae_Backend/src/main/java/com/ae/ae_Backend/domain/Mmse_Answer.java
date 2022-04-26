package com.ae.ae_Backend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MMSE_ANSWER")
@Getter @Setter
public class Mmse_Answer {
    @Id
    @Column(name = "mmse_answer_id")
    private Long mmse_answer_id;
    private String answer;
    private String server_date;

    public Long getMmse_answer_id() {
        return mmse_answer_id;
    }

    public void setMmse_answer_id(Long mmse_answer_id) {
        this.mmse_answer_id = mmse_answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getServer_date() {
        return server_date;
    }

    public void setServer_date(String server_date) {
        this.server_date = server_date;
    }
}
