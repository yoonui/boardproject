package com.boardproject.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boardproject.board.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{
    
}
