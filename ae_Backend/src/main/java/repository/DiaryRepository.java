package repository;

import domain.Diary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DiaryRepository {

    private EntityManager em;

    public void save(Diary diary) {
        if(diary.getId() == null) {
            em.persist(diary);
        } else {
            em.merge(diary);
        }
    }

    public Diary findOne(Long id) {
        return em.find(Diary.class, id);
    }

    /*
    public List<Diary> findAll() {
        return em.createQuery("select d from Diary d", Diary.class).getResultList();
    }
    */

}
