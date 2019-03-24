package com.itbank.model.service;

import java.util.List;

import com.itbank.mode.domain.Board;

public interface BoardService {
	public List selectAll();
	public Board select(int board_id);
	public int insert(Board board);
	public int update(Board board);
	public int delete(int board_id);	
	
}
