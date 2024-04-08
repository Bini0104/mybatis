package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class MenuService {

    private final MemberDAO memberDAO;

    public MenuService() { memberDAO = new MemberDAO(); }
    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        List<MemberDTO> memberList = memberDAO.selectAllMember(sqlSession);

        sqlSession.close();

        return memberList;
    }

    public MemberDTO selectMemberById(int id) {

        SqlSession sqlSession = getSqlSession();

        MemberDTO member = memberDAO.selectMemberById(sqlSession, id);

        sqlSession.close();

        return member;
    }
}
