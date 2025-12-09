package com.boardproject.board.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boardproject.board.dto.CommentDTO;
import com.boardproject.board.entity.BoardEntity;
import com.boardproject.board.entity.CommentEntity;
import com.boardproject.board.repository.BoardRepository;
import com.boardproject.board.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    public Long save(CommentDTO commentDTO) {
        /* 부모 엔티티(BoardRepository) 조회 */
        Optional<BoardEntity> optionalBoardEntity = boardRepository.findById(commentDTO.getBoardId());

        if(optionalBoardEntity.isPresent()){
            BoardEntity boardEntity = optionalBoardEntity.get();
            CommentEntity commentEntity = CommentEntity.toSaveEntity(commentDTO, boardEntity);
            return commentRepository.save(commentEntity).getId();
        } else {
            return null;
        }
    }
}
