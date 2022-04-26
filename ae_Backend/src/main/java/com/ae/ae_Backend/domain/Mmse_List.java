package com.ae.ae_Backend.domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MMSE_LIST")
@Getter @Setter
public class Mmse_List {
    @Id
    @Column(name = "mmse_question_id")
    private Long mmse_question_id;
    private String question;
    private String voice_q;
    private String icon;
    private String servr_date;

    public Long getMmse_question_id() {
        return mmse_question_id;
    }

    public void setMmse_question_id(Long mmse_question_id) {
        this.mmse_question_id = mmse_question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getVoice_q() {
        return voice_q;
    }

    public void setVoice_q(String voice_q) {
        this.voice_q = voice_q;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getServr_date() {
        return servr_date;
    }

    public void setServr_date(String servr_date) {
        this.servr_date = servr_date;
    }
}
