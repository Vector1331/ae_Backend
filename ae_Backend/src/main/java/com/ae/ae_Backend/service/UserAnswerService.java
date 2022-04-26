package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.UserAnswer;
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

    public List<UserAnswer> findUserAnswers() {
        return userAnswerRepository.findAll();
    }

    public UserAnswer findOne(Long uaId) {
        return userAnswerRepository.findOne(uaId);
    }
}
