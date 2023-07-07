package com.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.member.domain.MemberVO;
import com.practice.config.PracticeConfig;

public class MemberDAO {
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = PracticeConfig.getSqlSessionFactory().openSession(true);
	}
	
//	회원가입
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);
	}
	
//	아이디 중복검사
	public String selectIdentificatoin(String memberIdentification) {
		return sqlSession.selectOne("member.selectIdentification", memberIdentification);
	}
	
	
}
