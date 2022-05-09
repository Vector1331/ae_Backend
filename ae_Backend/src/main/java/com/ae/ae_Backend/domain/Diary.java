package com.ae.ae_Backend.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="diary")
@Getter @Setter
public class Diary {

    @Id
    @GeneratedValue
    @Column(name = "diary_id")
    private Long id;

    @Column(name="image_url")
    private String image;

    @Column(name="source_audio_url")
    private String sourceAudio;

    private String text;

    private String serverDate;

    private String userDate;


    // 주 테이블에 외래키, 단방향
    // Diary 테이블을 주 테이블로 설정 (외래키가 있는 곳이 연관관계의 주인)
    @OneToOne
    @JoinColumn(name="user_user_id")
    private User user;

    /*User 엔티티에서 추가해주어야 함
    //이 diary 필드는 읽기 전용 필드
    @JsonIgnore
    @OneToOne(mappedBy= "user")
    private Diary diary;
     */

    public static Diary createDiary(User user, String image, String sourceAudio, String text) {
        Diary diary = new Diary();
        diary.setUser(user);
        diary.setImage(image);
        diary.setSourceAudio(sourceAudio);
        diary.setText(text);
        return diary;
    }


}
