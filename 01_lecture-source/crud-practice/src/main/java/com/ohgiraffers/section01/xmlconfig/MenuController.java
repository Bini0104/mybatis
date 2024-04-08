package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final PrintResult printResult;
    private final MenuService menuService;
    public MenuController(){
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
            printResult.printMember(member);
        }else {
            printResult.printErrorMessage("selectMemberById");
        }
    }

    public void registMember(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");


    }
}
