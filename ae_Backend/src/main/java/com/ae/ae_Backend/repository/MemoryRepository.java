package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.Memory;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MemoryRepository {
    private final EntityManager em;

    public MemoryRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Memory memory) {
        em.persist(memory);
    }

    public Memory findOne(Long id) {
        return em.find(Memory.class, id);
    }

    public List<Memory> findAll() {
        return em.createQuery("select m from Memory m", Memory.class)
                .getResultList();
    }

    public List<Memory> findAllWithUser() {
        return em.createQuery(
                        "select m from Memory m" +
                                " join fetch m.user u", Memory.class)
                .getResultList();
    }

}
