package com.ae.ae_Backend.api;

import com.ae.ae_Backend.domain.userdata;
import com.ae.ae_Backend.service.userdataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class userdataApiController {
    private final userdataService userdataService;

    @GetMapping("/api/v1/userdata/{id}")
    public userdata getUserData(@PathVariable("id") Long id) {
        userdata findUserdata = userdataService.findOne(id);
        return findUserdata;

        //예외처리 구문 추가 필요

    }

    @GetMapping("/api/v1/userdatas")
    public List<userdata> userDatas() {
        return userdataService.findUserDatas();
    }
}