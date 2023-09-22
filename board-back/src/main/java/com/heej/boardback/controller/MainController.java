package com.heej.boardback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 서버 체크용 (test)
@RestController
@RequestMapping("")
public class MainController {

    @GetMapping("")
    public String serverCheck() {
        return "Server on...";
    }
    
}
