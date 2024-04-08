package com.ohgiraffers.section01.xmlconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuController menuController = new MenuController();

        do{
            System.out.println("=========== 실습문제 연습 ===========");
            System.out.println("1. 전체 직원 조회");
            System.out.println("2. 직원 상세 조회");
            System.out.println("3. 직원 추가");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 추가");
            System.out.println("9. 직원 탈퇴");
            System.out.print("직원 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.selectAllMember(); break;
                case 2 : menuController.selectMemberById(inputMemberId()); break;
                case 3 : menuController.registMember(inputMember()); break;
            }
        }while (true);
    }
    private static Map<String,String> inputMemberId(){
        Scanner sc = new Scanner(System.in);
        System.out.print("직원 아이디를 입력하세요. : ");
        String id = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }
    private static Map<String,String> inputMember(){

        Scanner sc = new Scanner(System.in);
        System.out.print("추가하실 직원 아이디를 입력하세요. : ");
        String id = sc.nextLine();
        System.out.print("추가하실 직원 이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.print("추가하실 직원 주민등록번호를 입력하세요. : ");
        String empNo = sc.nextLine();
        System.out.print("추가하실 직원 이메일을 입력하세요. : ");
        String email = sc.nextLine();
        System.out.print("추가하실 직원 전화번호를 입력하세요. : ");
        String phone = sc.nextLine();
        System.out.print("추가하실 직원 부서 코드를 입력하세요. : ");
        String deptCode = sc.nextLine();
        System.out.print("추가하실 직원 직책 코드를 입력하세요. : ");
        String jobCode = sc.nextLine();
        System.out.print("추가하실 직원 연봉 레벨을 입력하세요. : ");
        String salLevel = sc.nextLine();
        System.out.print("추가하실 직원 연봉을 입력하세요. : ");
        String salary = sc.nextLine();
        System.out.print("추가하실 직원 보너스을 입력하세요. : ");
        String bonus = sc.nextLine();
        System.out.print("추가하실 매니저 아이디를 입력하세요. : ");
        String managerId = sc.nextLine();
        System.out.println("입사일을 입력하세요 (YYYY-MM-DD) : ");
        String hireDate = sc.nextLine();
        System.out.println("퇴사일 입력하세요 (YYYY-MM-DD or null) : ");
        String entDate = sc.nextLine();
        System.out.println("퇴사 정보를 입력하세요 (Y/N) : ");
        String entYn = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("id",id);
        parameter.put("name",name);
        parameter.put("empNo",empNo);
        parameter.put("email",email);
        parameter.put("phone",phone);
        parameter.put("deptCode",deptCode);
        parameter.put("jobCode",jobCode);
        parameter.put("salLevel",salLevel);
        parameter.put("salary",salary);
        parameter.put("bonus",bonus);
        parameter.put("managerId",managerId);
        parameter.put("hireDate",hireDate);
        parameter.put("entDate",entDate);
        parameter.put("entYn",entYn);

        return parameter;
    }
}