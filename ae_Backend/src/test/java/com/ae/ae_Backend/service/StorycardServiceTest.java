package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.Storycard;
import com.ae.ae_Backend.repository.StorycardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@SpringBootTest
@Transactional
class StorycardServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    StorycardService storyCardService;
    @Autowired
    StorycardRepository storyCardRepository;

    @Test
    void 기억카드조회() {
        // given
        //int storyCardId = (int)(Math.random() * 20) + 1;
        Long storyCardId = 0L;

        // when
        Storycard result = storyCardService.findOne(storyCardId);

        // then
        Storycard compare = storyCardRepository.findOne(storyCardId);

        assertEquals(storyCardId, result.getId());
    }
}