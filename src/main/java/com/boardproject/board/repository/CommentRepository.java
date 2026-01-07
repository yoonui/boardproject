package com.boardproject.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardproject.board.entity.BoardEntity;
import com.boardproject.board.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
    // select * from comment_table where board_id=? order by board_created_time desc;
    List<CommentEntity> findAllByBoardEntityOrderByCreatedTimeDesc(BoardEntity boardEntity);
}
