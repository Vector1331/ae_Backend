package service;
import domain.Mmse_Answer;
import domain.UserData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.Mmse_AnswerRepository;
import repository.UserDataRepository;

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
