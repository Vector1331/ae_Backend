package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.userdata;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.userdataRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class userdataService {
    private final userdataRepository userDataRepository;

    public List<userdata> findUserDatas() {
        return userDataRepository.findAll();
    }

    public userdata findOne(Long user_data_id) {
        return userDataRepository.findOne(user_data_id);
    }
}
