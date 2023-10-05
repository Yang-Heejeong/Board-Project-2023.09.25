package com.heej.boardback.service;

import org.springframework.http.ResponseEntity;

import com.heej.boardback.dto.request.board.PostBoardRequestDto;
import com.heej.boardback.dto.response.board.GetBoardResponseDto;
import com.heej.boardback.dto.response.board.GetFavoriteListResponseDto;
import com.heej.boardback.dto.response.board.GetLatestBoardListResponseDto;
import com.heej.boardback.dto.response.board.PostBoardResponseDto;

public interface BoardService {
    
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);

    ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    ResponseEntity<? super GetFavoriteListResponseDto> getFavorietList(Integer boardNumber);
    ResponseEntity<? super GetLatestBoardListResponseDto> getLatestBoardList();
}
