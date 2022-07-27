package com.spring.boardweb.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boardweb.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
														//int를 class로 쓰기위해 integer를 사용
	//By뒤에는 Entity의 컬럼명
	//And Or로 Where 절에 붙을 조건절 설정 
	//Containing 키워드로 like '%%'구문 설정 
	
	// SELECT * FROM T_BOARD 
	//   WHERE BOARD_TITLE LIKE '%searchKeyword1%'
	//     OR BOARD_WIRTER LIEK '%searchKeyword2%'
	//     OR BOARD_WIRTER LIEK '%searchKeyword3%'
	
	Page<Board> findByBoardTitleContainingOrBoardWriterContainingOrBoardContentContaining(String searchKeyword1, String searchKeyword2, String searchKeyword3, Pageable pageable);


	//SELECT * FROM T_BOARD 
	//   WHERE BOARD_TITLE LIKE '%searchKeyword%'
	Page<Board> findByBoardTitleContaining(String serachKeyword, Pageable pageable);
	
	//SELECT * FROM T_BOARD 
	//   WHERE BOARD_WRITER LIKE '%searchKeyword%'
	Page<Board> findByBoardWriterContaining(String serachKeyword, Pageable pageable);
	
	//SELECT * FROM T_BOARD 
		//   WHERE BOARD_CONTENT LIKE '%searchKeyword%'
	Page<Board> findByBoardContentContaining(String serachKeyword, Pageable pageable);
		
	
}