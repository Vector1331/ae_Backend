package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.UserAns;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserAnswerRepository {
    private final EntityManager em;
    public void save(UserAns answer) { em.persist(answer); }
    public List<UserAns> findAll() {
        return em.createQuery("select ua from UserAns ua", UserAns.class).getResultList();
    }
    public UserAns findOne(Long id) { return em.find(UserAns.class, id); }
}
