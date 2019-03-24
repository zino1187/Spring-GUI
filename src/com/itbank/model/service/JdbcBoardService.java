package com.itbank.model.service;

import java.sql.Connection;
import java.util.List;

import com.itbank.common.PoolManager;
import com.itbank.mode.domain.Board;
import com.itbank.model.repository.BoardDAO;
import com.itbank.model.repository.JdbcBoardDAO;

public class JdbcBoardService implements BoardService{
	String TAG=this.getClass().getName();
	private PoolManager pool;
	private JdbcBoardDAO jdbcBoardDAO;
	private Connection con;
	
	public void setPool(PoolManager pool) {
		this.pool = pool;
	}
	
	//injection 을 위한 setter
	public void setJdbcBoardDAO(JdbcBoardDAO jdbcBoardDAO) {
		this.jdbcBoardDAO = jdbcBoardDAO;
	}
	
	@Override
	public List selectAll() {
		return null;
	}

	@Override
	public Board select(int board_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Board board) {
		try {
			this.con=pool.getConnection();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(TAG+": insert 호출"+this.con);
		try {
			jdbcBoardDAO.setCon(this.con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		jdbcBoardDAO.insert(board);
		
		System.out.println(TAG+": insert 호출"+this.con);
		pool.freeConnection(con);

		return 0;
	}

	@Override
	public int update(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int board_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
