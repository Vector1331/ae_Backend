package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.Mmse_List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class Mmse_ListRepository {

    private EntityManager em;

    public Mmse_List findOne(Long id) {
        return em.find(Mmse_List.class, id);
    }

    public List<Mmse_List> findAll() {
        return em.createQuery("select ml from MMSE_LIST ml",Mmse_List.class).getResultList();
    }
}
