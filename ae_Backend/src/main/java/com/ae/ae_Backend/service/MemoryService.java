package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.Memory;
import com.ae.ae_Backend.domain.User;
import com.ae.ae_Backend.repository.MemoryRepository;
import com.ae.ae_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemoryService {

    private final MemoryRepository memoryRepository;
    private final UserRepository userRepository;

    /**
     *  추억 저장
     **/
    @Transactional
    public Long Memory(Long user_id) {

        //엔티티 조회
        User user = userRepository.findOne(user_id);

        //추억 생성
        Memory memory = Memory.createMemory(user);

        //추억 저장
        memoryRepository.save(memory);

        return memory.getMemory_id();
    }
}
