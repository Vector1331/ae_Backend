package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.mmseList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class mmseListRepository {

    private EntityManager em;

    public mmseList findOne(Long id) {
        return em.find(mmseList.class, id);
    }

    public List<mmseList> findAll() {
        return em.createQuery("select ml from mmse_list ml", mmseList.class).getResultList();
    }
}