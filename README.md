# 게시판 주요 기능

1. 글쓰기 /board/save
2. 글목록 /board
3. 글조회 /board/{id}
4. 글수정 /board/update/{id}
5. 글삭제 /board/delete/{id}
6. 페이징 /board/paging
   - /board/paging?page=2
7. 파일(이미지) 첨부하기
   - 단일 파일 첨부
   - 다중 파일 첨부
8. 댓글 처리하기
   - 글 상세 페이지에서 댓글 입력(ajax)
   - 상세 조회할 때 기존 작성된 댓글 목록이 보임
   - 댓글을 입력하면 기존 댓글 목록에 새로 작성한 댓글 추가
   - 댓글용 테이블 필요
