package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MemController {

    private final PrintResult printResult;
    private final MenuService menuService;
    public MemController(){
        printResult = new PrintResult();
        menuService =new MenuService();
    }

    public void selectAllMember() {

        List<MemberDTO> memberList = menuService.selectAllMember();

        if (memberList != null){
            printResult.printMemberList(memberList);
        } else {
            printResult.printErrorMessage("selectMemberList");
        }
    }

    public void selectMemberById(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        MemberDTO member = menuService.selectMemberById(id);
        if (member != null){
            System.out.println("직원 상세 정보 조회입니다.");
            printResult.printMember(member);
        }else {
            printResult.printErrorMessage("selectMemberById");
        }
    }

    public void registMember(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        String empNo = parameter.get("empNo");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        String hireDate = parameter.get("hireDate");
        String entYn = parameter.get("entYn");

        MemberDTO member = new MemberDTO();

        member.setId(id);
        member.setName(name);
        member.setEmpNo(empNo);
        member.setJobCode(jobCode);
        member.setSalLevel(salLevel);
        member.setHireDate(hireDate);
        member.setEntYn(entYn);

        if (menuService.registMember(member)){
            printResult.printSuccessMember("insert");
        }else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMember(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String salLevel = parameter.get("salLevel");

        MemberDTO member = new MemberDTO();
        member.setId(id);
        member.setSalLevel(salLevel);

        if (menuService.modifyMember(member)){
            printResult.printSuccessMember("update");
        }else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        if (menuService.deleteMember(id)){
            printResult.printSuccessMember("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
