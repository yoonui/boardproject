package com.boardproject.board.dto;

import java.time.LocalDateTime;

import com.boardproject.board.entity.CommentEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    private LocalDateTime commentCreatedTime;

    public static CommentDTO toCommentDTO(CommentEntity commentEntity, Long boardId) {
        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setId(commentEntity.getId());
        commentDTO.setCommentWriter(commentEntity.getCommentWriter());
        commentDTO.setCommentContents(commentEntity.getCommentContents());
        commentDTO.setCommentCreatedTime(commentEntity.getCreatedTime());
        // commentDTO.setBoardId(commentEntity.getBoardEntity().getId()); // Service 메서드에 @Transactional 어노테이션 붙이기
        commentDTO.setBoardId(boardId);

        return commentDTO;
    }
}
