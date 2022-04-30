package com.ae.ae_Backend.repository;

import com.ae.ae_Backend.domain.UserData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDataRepository {

    private EntityManager em;

    public UserData findOne(Long id) {
        return em.find(UserData.class, id);
    }

    public List<UserData> findAll() {
        return em.createQuery("select u from USERDATA u",UserData.class).getResultList();
    }

}
