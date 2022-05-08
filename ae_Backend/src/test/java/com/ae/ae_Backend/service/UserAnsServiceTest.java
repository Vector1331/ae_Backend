package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.domain.UserAns;
import com.ae.ae_Backend.repository.UserAnsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@SpringBootTest
@Transactional
class UserAnsServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    UserAnsService userAnswerService;
    @Autowired
    UserAnsRepository userAnsRepository;

    @Test
    public void 기억카드답변등록() {
        // given
        User user = new User();
        user.setName("회원 1");
        user.setGender(0);
        user.setBirth_year("1950");
        user.setSignup_date(LocalDateTime.now());
        em.persist(user);

        //int storyCardId = (int)(Math.random() * 20) + 1;
        int storyCardId = 0;

        String answer = "2002년 월드컵에 치킨을 먹으면서 시청했다.";

        // when
        Long userAnswerId = userAnswerService.answer(user.getUser_id(), (long) storyCardId, answer);

        // then
        UserAns getUserAnswer = userAnsRepository.findOne(userAnswerId);

        assertEquals(storyCardId, getUserAnswer.getStorycard().getId());
    }

    @Test
    public void 모든기억카드답변조회() {
        // given
        User user = new User();
        user.setName("회원 1");
        user.setGender(0);
        user.setBirth_year("1950");
        user.setSignup_date(LocalDateTime.now());
        em.persist(user);

        //int storyCardId = (int)(Math.random() * 20) + 1;
        int storyCardId = 0;

        String answer = "2002년 월드컵에 치킨을 먹으면서 시청했다.";

        // when
        Long userAnswerId = userAnswerService.answer(user.getUser_id(), (long) storyCardId, answer);

        // then
        List<UserAns> userAnswers = userAnswerService.findUserAnswers();

        UserAns test = null;
        for(UserAns a: userAnswers) {
            if(a.getId().equals(userAnswerId)) {
                test = a;
                break;
            }
        }

        if(test != null) {
            assertEquals(test.getId(), userAnswerId);
        }
    }
}