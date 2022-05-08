package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.Storycard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.StorycardRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StorycardService {
    private final StorycardRepository storyCardRepository;

    public List<Storycard> findStoryCards() {
        return storyCardRepository.findAll();
    }

    public Storycard findOne(Long scId) {
        return storyCardRepository.findOne(scId);
    }
}
