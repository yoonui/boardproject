package com.boardproject.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardproject.board.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
    
}
