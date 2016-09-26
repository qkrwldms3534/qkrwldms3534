package svntest.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import svntest.board.service.BoardService;
import svntest.board.service.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	
	@Override
	public List<BoardVO> listBoard(BoardVO boardVo) {
		return boardDAO.listBoard(boardVo);
	}
	

	public void insertBoard(BoardVO boardVo) {
		boardDAO.insertBoard(boardVo);
	}


}
