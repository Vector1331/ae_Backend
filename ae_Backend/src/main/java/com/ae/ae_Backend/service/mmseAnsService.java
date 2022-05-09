package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.mmseAns;
import com.ae.ae_Backend.domain.mmseList;
import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.*;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class mmseAnsService {

    private final mmseAnsRepository mmseAnsRepository;
    private final UserRepository userRepository;
    private final mmseListRepository mmseListRepository;

    public List<mmseAns> findmmseAnsDatas() {
        return mmseAnsRepository.findAll();
    }

    public mmseAns findOne(Long mmse_ans_id) {
        return mmseAnsRepository.findOne(mmse_ans_id);
    }

    @Transactional
    public Long mmseAns(Long userId, Long mmseListId, String answer) {
        User user = userRepository.findOne(userId);
        mmseList mmseList = mmseListRepository.findOne(mmseListId);

        mmseAns mmseAnswer = mmseAns.createMmseAnswer(user, mmseList, answer);

        mmseAnsRepository.save(mmseAnswer);
        return mmseAnswer.getMmse_ans_id();
    }
}