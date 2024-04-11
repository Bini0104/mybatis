package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMember();

    MemberDTO selectMemberById(int id);

    int insertMember(MemberDTO member);

    int updateMember(MemberDTO member);

    int deleteMember(int id);
}
