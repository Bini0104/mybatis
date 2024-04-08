package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMemberList(List<MemberDTO> memberList) {

        for (MemberDTO member : memberList){
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectMemberList" : errorMessage = "직원 전체 조회에 실패하였습니다."; break;
            case "selectMemberById" : errorMessage = "직원 조회에 실패하였습니다."; break;
        }
    }

    public void printMember(MemberDTO member) {
        System.out.println(member);
    }
}
