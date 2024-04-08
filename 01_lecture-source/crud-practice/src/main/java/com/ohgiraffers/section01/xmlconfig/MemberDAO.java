package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MemberDAO {
    public List<MemberDTO> selectAllMember(SqlSession sqlSession) {

        return sqlSession.selectList("MemberMapper.selectAllMember");
    }

    public MemberDTO selectMemberById(SqlSession sqlSession, int id) {

        return sqlSession.selectOne("MemberMapper.selectMemberById", id);
    }
}
