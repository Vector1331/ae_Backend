package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.MmseList;
import com.ae.ae_Backend.repository.MmseListRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@SpringBootTest
@Transactional
class MmseListServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    MmseListService mmseListService;
    @Autowired
    MmseListRepository mmseListRepository;

    @Test
    void 테스트질문조회() {
        //given
        Long mmseListId = 0L;

        //when
        MmseList result = mmseListService.findOne(mmseListId);


        MmseList cmp = mmseListRepository.findOne(mmseListId);
        //then
        assertEquals(mmseListId, result.getMmse_list_id());
        assertEquals(mmseListId, cmp.getMmse_list_id());
        assertEquals(result.getMmse_list_id(), cmp.getMmse_list_id());
    }
}