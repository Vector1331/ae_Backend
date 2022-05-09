package com.ae.ae_Backend.service;
import com.ae.ae_Backend.domain.mmseList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.mmseListRepository;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class mmseListService {
    private final mmseListRepository mmseListRepository;

    public List<mmseList> findmmseLists() {
        return mmseListRepository.findAll();
    }

    public mmseList findOne(Long mId) {
        return mmseListRepository.findOne(mId);
    }
}
