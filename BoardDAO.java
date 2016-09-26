package svntest.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import svntest.board.service.BoardVO;

@SuppressWarnings("unchecked")
@Repository("boardDAO")
public class BoardDAO extends SqlMapClientDaoSupport {
	
	@Resource(name="sqlMapClientTemplate")
	public void init(SqlMapClientTemplate sqlMapClientTemplate){
		super.setSqlMapClientTemplate(sqlMapClientTemplate);
	}
	
	/**
	 * @param boardVo
	 * @return
	 */
	public List<BoardVO> listBoard(BoardVO boardVo) {		
		return (List<BoardVO>)getSqlMapClientTemplate().queryForList("Board.listBoard", boardVo);
	}
	
	/**
	 * @param boardVo
	 */
	public void insertBoard(BoardVO boardVo) {		
		Integer idx = (Integer)getSqlMapClientTemplate().insert("Board.insertBoard",boardVo);

	}
	
}
