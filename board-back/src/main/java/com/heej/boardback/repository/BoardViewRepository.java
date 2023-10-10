package com.heej.boardback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heej.boardback.entity.BoardViewEntity;

@Repository
public interface BoardViewRepository extends JpaRepository<BoardViewEntity, Integer> {

    BoardViewEntity findByBoardNumber(Integer boardNumber);

    List<BoardViewEntity> findByOrderByWriteDatetimeDesc();
    List<BoardViewEntity> findByWriterEmailOrderByWriteDatetimeDesc(String email);

    List<BoardViewEntity> findByWriterEmail(String email);
}
