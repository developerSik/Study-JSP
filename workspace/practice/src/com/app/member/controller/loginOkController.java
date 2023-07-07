package com.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.practice.dao.MemberDAO;

public class loginOkController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		
		String name = req.getParameter("memberName");
		int age = Integer.parseInt(req.getParameter("memberAge"));
		
		Long memberId = memberDAO.login(name, age);
		
		if(memberDAO != null) {
//			로그인 성공
			result.setPath("main");
		}else {
//			로그인 실패
			result.setPath("join.member");
		}
		
		return null;
	}

}
