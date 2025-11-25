package com.boardproject.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardproject.board.entity.BoardFileEntity;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long>{
    
}
