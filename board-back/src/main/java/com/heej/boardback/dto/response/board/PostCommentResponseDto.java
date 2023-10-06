package com.heej.boardback.dto.response.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.heej.boardback.dto.response.ResponseCode;
import com.heej.boardback.dto.response.ResponseDto;
import com.heej.boardback.dto.response.ResponseMessage;

import lombok.Getter;

@Getter
public class PostCommentResponseDto extends ResponseDto {

    private PostCommentResponseDto(String code, String message) {
        super(code, message);
    }

    public ResponseEntity<PostCommentResponseDto> success() {
        PostCommentResponseDto result = new PostCommentResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    
}
