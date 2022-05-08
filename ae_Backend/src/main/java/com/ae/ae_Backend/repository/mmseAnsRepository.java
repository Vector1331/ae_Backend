package com.ae.ae_Backend.repository;

        import com.ae.ae_Backend.domain.mmseAns;
        import lombok.RequiredArgsConstructor;
        import org.springframework.stereotype.Repository;

        import javax.persistence.EntityManager;
        import java.util.List;

@Repository
@RequiredArgsConstructor
public class mmseAnsRepository {
    private EntityManager em;

    public void save(mmseAns mmseAns) {
        em.persist(mmseAns);
    }

    public mmseAns findOne(Long id) {
        return em.find(mmseAns.class, id);
    }

    public List<mmseAns> findAll() {
        return em.createQuery("select ma from mmse_ans ma", mmseAns.class).getResultList();
    }
}