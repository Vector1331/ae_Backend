package com.ae.ae_Backend.service;

import com.ae.ae_Backend.domain.UserData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ae.ae_Backend.repository.UserDataRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserDataService {
    private final UserDataRepository userDataRepository;

    public List<UserData> findUserDatas() {
        return userDataRepository.findAll();
    }

    public UserData findOne(Long user_data_id) {
        return userDataRepository.findOne(user_data_id);
    }
}
