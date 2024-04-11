package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMemberList(List<MemberDTO> memberList) {
        System.out.println("직원 전체 정보 입니다.");
        for (MemberDTO member : memberList){
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectMemberList" : errorMessage = "직원 전체 조회를 실패하였습니다."; break;
            case "selectMemberById" : errorMessage = "직원 조회를 실패하였습니다."; break;
            case "insert" : errorMessage = "직원 추가를 실패하였습니다"; break;
            case "update" : errorMessage = "직원정보 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "직원 삭제를 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printMember(MemberDTO member) {

        System.out.println(member);
    }

    public void printSuccessMember(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "직원 추가를 성공하였습니다."; break;
            case "update" : successMessage = "직원 정보 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "직원 삭제를 성고하였습니다."; break;
        }
        System.out.println(successMessage);
    }
}