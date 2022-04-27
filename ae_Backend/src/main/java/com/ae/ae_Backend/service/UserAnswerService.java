package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.StoryCard;
import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.domain.UserAnswer;
import com.ae.ae_Backend.repository.StoryCardRepository;
import com.ae.ae_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.UserAnswerRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserAnswerService {

    private final UserAnswerRepository userAnswerRepository;
    private final UserRepository userRepository;
    private final StoryCardRepository storyCardRepository;

    public List<UserAnswer> findUserAnswers() {
        return userAnswerRepository.findAll();
    }

    public UserAnswer findOne(Long uaId) {
        return userAnswerRepository.findOne(uaId);
    }

    @Transactional
    public Long answer(Long userId, Long scId, String answer) {
        // 엔티티 조회
        User user = userRepository.findOne(userId);
        StoryCard storyCard = storyCardRepository.findOne(scId);

        // 기억상자 답변 생성
        UserAnswer userAnswer = UserAnswer.createUserAnswer(user, storyCard, answer);

        // 기억상자 답변 저장
        userAnswerRepository.save(userAnswer);

        return userAnswer.getId();
    }
}
