package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.mybatis.vo.MemberVO;

public class MemberDAO {
	public SqlSession sqlSession;

	public MemberDAO() {										//autoCommit
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	//r, in, check, my, out, delete
	//서블릿이 Factory 역할을 해줘야 한다.
	//쓸 때 DB에서 가져온다는 느낌이 들게 작명하자.
	public void insert(MemberVO member) {sqlSession.insert("member.insert", member);}
	
	public List<MemberVO> selectAll() {return sqlSession.selectList("member.selectAll");}
	
	public boolean getCountOfMemberName(String memberName) {
		return (Integer)sqlSession.selectOne("member.getCountOfMemberName", memberName) == 0;
	}
	
	public MemberVO select(Long memberId) {
		return sqlSession.selectOne("member.select", memberId);
	}
	
	public void delete(Long memberId) {
		sqlSession.delete("member.delete", memberId);
	}
}
