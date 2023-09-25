package com.heej.boardback.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heej.boardback.dto.response.user.GetSignInUserResponseDto;
import com.heej.boardback.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(
        // 인증 주체. email에서 꺼내서 사용
        @AuthenticationPrincipal String emil
    ) {
        ResponseEntity<? super GetSignInUserResponseDto> response = userService.getSignInUser(emil);
        return response;
    }
    
}
