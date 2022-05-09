package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.userdata;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class userdataRepository {

    private EntityManager em;

    public userdata findOne(Long id) {
        return em.find(userdata.class, id);
    }

    public List<userdata> findAll() {
        return em.createQuery("select u from userdata ud", userdata.class).getResultList();
    }

}
