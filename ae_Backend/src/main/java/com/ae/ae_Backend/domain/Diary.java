package com.ae.ae_Backend.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="DIARY")
@Getter @Setter
public class Diary {

    @Id
    @GeneratedValue
    @Column(name = "DIARY_ID")
    private Long id;

    @Column(name="IMAGE_URL")
    private String image;

    @Column(name="SOURCE_AUDIO_URL")
    private String source_audio;

    private String title;

    private String text;

    private String server_date;

    private String user_date;

    /*
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User user;
     */



}