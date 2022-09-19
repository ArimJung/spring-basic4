package com.kim.biz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kim.biz.board.BoardVO;
import com.kim.biz.board.impl.BoardDAO;

public class MainController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		BoardVO bvo=new BoardVO();
		BoardDAO bdao=new BoardDAO();
		List<BoardVO> datas= new ArrayList<BoardVO>();
		
		datas = bdao.selectAllBoard(bvo);
		request.setAttribute("datas", datas);

		return "main";
		
	}

}
