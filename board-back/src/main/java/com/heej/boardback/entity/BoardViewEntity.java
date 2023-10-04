package com.heej.boardback.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Entity(name="board_view")
@Table(name="board_view")
public class BoardViewEntity {
    @Id
    private int boardNumber;
    private String title;
    private String content;
    private String boardTitleImage;
    private int viewCount;
    private int favoriteCount;
    private int commentCount;
    private String writerDatetime;
    private String writerEmail;
    private String writerNickname;
    private String writerProfileImage;
}
