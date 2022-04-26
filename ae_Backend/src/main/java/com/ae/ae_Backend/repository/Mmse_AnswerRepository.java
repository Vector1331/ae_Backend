package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.Mmse_Answer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class Mmse_AnswerRepository {
    private EntityManager em;

    public void save(Mmse_Answer mmseAnswer) {
        em.persist(mmseAnswer);
    }

    public Mmse_Answer findOne(Long id) {
        return em.find(Mmse_Answer.class, id);
    }

    public List<Mmse_Answer> findAll() {
        return em.createQuery("select ma from MMSE_ASWER ma",Mmse_Answer.class).getResultList();
    }
}
