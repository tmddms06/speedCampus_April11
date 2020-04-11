<%@page import="tommy.spring.web.board.impl.BoardDAO"%>
<%@page import="tommy.spring.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//1. 사용자의 입력 정보 추출
	//숫자만받아서 utf-8인코딩안해도됨
	String seq = request.getParameter("seq");
	
	//2. 데이터베이스 연동 처리

	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	
	//3. 화면 네비게이션
	
	response.sendRedirect("getBoardList.jsp");			

%>