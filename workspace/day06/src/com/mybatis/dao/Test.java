package com.mybatis.dao;

import com.mybatis.vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberVO member = new MemberVO();
		member.setMemberId(1l);
		member.setMemberName("hds");
		member.setMemberAge(20);
		
		//dao.insert(member);
		System.out.println(dao.getCountOfMemberName("chan22"));
		//dao.delete(3l);
		
		dao.update(member);
	}
}
