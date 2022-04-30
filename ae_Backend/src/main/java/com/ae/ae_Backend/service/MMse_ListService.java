package com.ae.ae_Backend.service;
import com.ae.ae_Backend.domain.Mmse_List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.Mmse_ListRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MMse_ListService {
    private final Mmse_ListRepository mmseListRepository;

    public List<Mmse_List> findmmseLists() {
        return mmseListRepository.findAll();
    }

    public Mmse_List findOne(Long mId) {
        return mmseListRepository.findOne(mId);
    }
}
