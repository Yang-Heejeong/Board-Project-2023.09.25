package com.heej.boardback.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 데이터베이스 테이블과 Mapping

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
// 이름이 user인 테이블과 Mapping 시키겠다.
@Table(name="user")
public class UserEntity {
    @Id
    private String email;
    private String password;
    private String nickname;
    private String telNumber;
    private String address;
    private String addressDetail;
    private boolean agreedPersonal;
    private String profileImageUrl;
}
