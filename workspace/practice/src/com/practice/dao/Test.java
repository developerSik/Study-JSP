package com.practice.dao;

import com.practice.vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = memberDAO.select(1L);
		
		
		memberVO.setMemberName("이순신");
		
		memberDAO.update(memberVO);
	
		
		
//		System.out.println(memberDAO.select(7L));
		
//		System.out.println(memberDAO.getCountOfMemberName("정상식"));
		
//		memberDAO.selectAll().forEach(System.out::println);
		
		
//		MemberVO memberVO = new MemberVO();
//		memberVO.setMemberName("홍길동");
//		memberVO.setMemberAge(28);
//	
//		memberDAO.insert(memberVO);
		
	}
	
}
