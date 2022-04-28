package service;

import domain.Diary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.DiaryRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DiaryService {

    private final DiaryRepository diaryRepository;

    @Transactional
    public void saveDiary (Diary diary){
        diaryRepository.save(diary);
    }

    public Diary findOne(Long id){
        return diaryRepository.findOne(id);
    }

    /*
    public List<Diary> findDiarys() {
        return diaryRepository.findAll();
    }
     */
}
