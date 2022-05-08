package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.Storycard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StorycardRepository {
    private final EntityManager em;
    public void save(Storycard card) { em.persist(card); }
    public List<Storycard> findAll() {
        return em.createQuery("select sc from StoryCard sc", Storycard.class).getResultList();
    }
    public Storycard findOne(Long id) { return em.find(Storycard.class, id); }
}
