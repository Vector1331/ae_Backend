package com.ae.ae_Backend.service;
import com.ae.ae_Backend.domain.Mmse_Answer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.Mmse_AnswerRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MMse_AnswerService {

    private final Mmse_AnswerRepository mmseAnswerRepository;

    public List<Mmse_Answer> findmmseAswerDatas() {
        return mmseAnswerRepository.findAll();
    }

    public Mmse_Answer findOne(Long mmse_answer_id) {
        return mmseAnswerRepository.findOne(mmse_answer_id);
    }
}
