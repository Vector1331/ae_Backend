package com.ae.ae_Backend.api;

import com.ae.ae_Backend.domain.mmseList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class mmseListApiController {
    private final com.ae.ae_Backend.service.mmseListService mmseListService;

    @GetMapping("/api/v1/mmseList/{id}")
    public mmseList getMmseList(@PathVariable("id") Long id) {

        mmseList findMmseList = mmseListService.findOne(id);
        return findMmseList;

        //예외처리 구문 추가 필요
    }
}