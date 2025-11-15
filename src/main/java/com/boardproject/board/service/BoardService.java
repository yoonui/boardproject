package com.boardproject.board.service;

import org.springframework.stereotype.Service;

import com.boardproject.board.dto.BoardDTO;
import com.boardproject.board.entity.BoardEntity;
import com.boardproject.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    
    public void save(BoardDTO boardDTO){
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    };
}
