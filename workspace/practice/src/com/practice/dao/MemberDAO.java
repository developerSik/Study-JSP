package com.practice.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.practice.config.PracticeConfig;
import com.practice.vo.MemberVO;


public class MemberDAO {

	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = PracticeConfig.getSqlSessionFactory().openSession(true);
	}
	
//	회원가입
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);		
	}
	
//	로그인
	public Long login(String memberName, int memberAge) {
		HashMap<String, Object> loginMap = new HashMap<String, Object>();
		loginMap.put("memberName", memberName);
		loginMap.put("memberAge", memberAge);
		
		return sqlSession.selectOne("member.login", loginMap);
	}

	
//	전체조회
	public List<MemberVO> selectAll() {
		return sqlSession.selectList("member.selectAll");
	}


// 이름 중복검사
	public boolean getCountOfMemberName(String memberName) {
		return (Integer)sqlSession.selectOne("member.getCountOfMemberName",memberName) == 0;
	}
	
//	마이페이지
	public MemberVO select(long memberId) {
		return sqlSession.selectOne("member.select", memberId);
	}
	
//	정보수정
	public void update(MemberVO memberVO) {
		sqlSession.update("member.update", memberVO);
	}

	
	
	
	
	
	
}
