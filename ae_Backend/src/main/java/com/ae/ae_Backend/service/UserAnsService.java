package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.Storycard;
import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.domain.UserAns;
import com.ae.ae_Backend.repository.StorycardRepository;
import com.ae.ae_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.UserAnsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserAnsService {

    private final UserAnsRepository userAnsRepository;
    private final UserRepository userRepository;
    private final StorycardRepository storyCardRepository;

    public List<UserAns> findUserAnswers() {
        return userAnsRepository.findAll();
    }

    public UserAns findOne(Long uaId) {
        return userAnsRepository.findOne(uaId);
    }

    @Transactional
    public Long answer(Long userId, Long scId, String answer) {
        // 엔티티 조회
        User user = userRepository.findOne(userId);
        Storycard storycard = storyCardRepository.findOne(scId);

        // 기억상자 답변 생성
        UserAns userAnswer = UserAns.createUserAnswer(user, storycard, answer);

        // 기억상자 답변 저장
        userAnsRepository.save(userAnswer);

        return userAnswer.getId();
    }
}
