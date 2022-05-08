package com.ae.ae_Backend.api;

import com.ae.ae_Backend.domain.Storycard;
import com.ae.ae_Backend.service.StorycardService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StorycardApiController {
    private final StorycardService storyCardService;

    // 원하는 번호(랜덤)에 해당하는 기억 카드 조회
    @PutMapping("/api/storycard/{id}")
    public Result storyCard(@PathVariable("id") Long id) {
        Storycard storycard = storyCardService.findOne(id);
        return new Result(storycard.getId(), storycard.getQuestion());
    }

    @Data
    @AllArgsConstructor
    static class Result {
        private Long id;
        private String question;
    }
}
