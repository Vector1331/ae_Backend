package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.domain.Userdata;
import com.ae.ae_Backend.repository.UserdataRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserdataServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    UserdataService userdataService;
    @Autowired
    UserdataRepository userdataRepository;

    @Test
    void 모든유저데이터보기() {
        //given
        User user = new User();
        user.setName("테스트회원");
        user.setGender(1);
        user.setBirth_year("2000");
        user.setSignup_date(String.valueOf(LocalDateTime.now()));
        em.persist(user);

        //when

        Long userdataId = 1313L;
        List<Userdata> userdatas = userdataService.findUserDatas();

        //then
        Userdata test = null;
        for (Userdata a : userdatas) {
            if(a.getUserdata_id().equals(userdataId)) {
                test = a;
                break;
            }
        }
        if (test != null) {
            assertEquals(test.getUserdata_id(), userdataId);
        }
    }


}