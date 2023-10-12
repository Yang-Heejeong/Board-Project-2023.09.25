package com.heej.boardback.service;

import org.springframework.http.ResponseEntity;

import com.heej.boardback.dto.response.search.GetPopularListResponseDto;

public interface SearchService {
    ResponseEntity<? super GetPopularListResponseDto> getPopularList();
}
