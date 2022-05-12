package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.MmseAns;
import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.repository.MmseAnsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@SpringBootTest
@Transactional
class MmseAnsServiceTest {
    @Autowired
    EntityManager em;
    @Autowired
    MmseAnsService mmseAnsService;
    @Autowired
    MmseAnsRepository mmseAnsRepository;

    @Test
    void 테스트답변등록() {
        //given
        User user = new User();
        user.setName("테스트회원");
        user.setGender(0);
        user.setBirth_year("1998");
        user.setSignup_date(String.valueOf(LocalDateTime.now()));
        em.persist(user);

        Long mmseListId = 0L;
        String answer = "저는 수영을 좋아합니다.";

        //when
        Long mmseAnsId = mmseAnsService.mmseAns(user.getUser_id(), mmseListId, answer);

        //then
        MmseAns getMmseAns = mmseAnsRepository.findOne(mmseAnsId);

        assertEquals(mmseListId, getMmseAns.getMmse_list().getMmse_list_id());
    }
}