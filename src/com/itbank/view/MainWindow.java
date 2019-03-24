package com.itbank.view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import com.itbank.mode.domain.Board;
import com.itbank.model.repository.BoardDAO;
import com.itbank.model.service.BoardService;

public class MainWindow extends JFrame{
	private JComponent t_id, t_pass, t_name;
	private JComponent p_south;
	private JButton bt_regist;
	private BoardService boardService;
	
	LayoutManager layout;
	
	public MainWindow() {
	
	}
	
	public MainWindow(String title, LayoutManager layout, JComponent t_id, JComponent t_pass, JComponent t_name,JComponent p_south, JButton bt_regist) {
		super(title);
		this.layout=layout;
		this.t_id=t_id;
		this.t_pass=t_pass;
		this.t_name=t_name;
		this.p_south=p_south;
		this.bt_regist= bt_regist;
		
		//조립하기
		init();
	}
	public void init() {
		this.setLayout(layout);
		add(t_id);
		add(t_pass);
		add(t_name);
		
		p_south.add(bt_regist);
		add(p_south, BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt_regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Board board = new Board();
				board.setWriter("batman");
				boardService.insert(board);
			}
		});
		
	}
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
}
