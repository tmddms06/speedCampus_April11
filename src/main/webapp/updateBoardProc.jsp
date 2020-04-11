<%@page import="tommy.spring.web.board.impl.BoardDAO"%>
<%@page import="tommy.spring.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. 사용자의 입력정보 추출
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	//2. 데이터베이스 연동처리
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	//3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp");



%>