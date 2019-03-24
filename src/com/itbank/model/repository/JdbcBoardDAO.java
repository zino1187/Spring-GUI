package com.itbank.model.repository;

import java.sql.Connection;
import java.util.List;

import com.itbank.mode.domain.Board;

public class JdbcBoardDAO implements BoardDAO{
	private Connection con;
	
	public void setCon(Connection con) {
		this.con = con;
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
		System.out.println(board.getWriter()+" 등록합니다");
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
