package com.heej.boardback.service;

import org.springframework.http.ResponseEntity;

import com.heej.boardback.dto.request.board.PostBoardRequestDto;
import com.heej.boardback.dto.response.board.PostBoardResponseDto;

public interface BoardService {
    
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);
}