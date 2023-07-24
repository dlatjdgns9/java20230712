package Test0724;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0724Test {
    public static void main(String[] args) {
        new MemberManager().start();

    }
}

class MemberManager {
    private boolean isStop;
    private Scanner scan;
    private ArrayList<Member> list;
    int idx;

    public MemberManager() {
        isStop = false;
        scan = new Scanner(System.in);
        list = new ArrayList<>();
        idx = -1;
    }

    public void start() {
        while (!isStop) {
            int menu = -1;
            mainMenu();

            try {
                menu = scan.nextInt();
                if (menu == 0) {
                    System.out.println("종료합니다.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("메뉴 번호를 눌러주세요");
                isStop=true;
                continue;
            }
            System.out.println();


            switch (menu) {
                case 1:
                    addMember();
                    break;
                case 2:
                    allMember();
                    break;
                case 3:
                    modifyMember();
                    break;
                default:
                    System.out.println("올바른 메뉴를 선택하세요");
                    break;

            }
        }
    }



    private void mainMenu() {
        System.out.println("\n==메뉴를 선택하세요==");
        System.out.println("1. 회원 가입");
        System.out.println("2. 회원 목록");
        System.out.println("3. 회원 수정");
        System.out.println("0. 종료");
        System.out.print("메뉴 선택 : ");
    }

    private void addMember() {
        System.out.print("1. id : ");
        String id = scan.next();
        System.out.print("2. pw : ");
        String pw = scan.next();
        System.out.print("3. 이름 : ");
        String name = scan.next();
        System.out.print("4. mobile : ");
        String mobile = scan.next();
        if (searchMember(id) != 1) {
            Member mem = new Member(id, pw, name, mobile);
            list.add(mem);
            System.out.println();
            System.out.println("회원가입에 성공했습니다.");
            System.out.println();
        }


    }


    private int searchMember(String checkId) {
        int check = 0;
        for (int i = 0; i < list.size(); i++) {
            Member mem = list.get(i);
            if (mem.getId().equals(checkId)) {
                System.out.println("아이디가 중복됩니다.");
                check=1;
                break;
            }
        }
        return check;
    }

    private void allMember() {
        System.out.println("==회원 목록==");
        for (int i = 0; i < list.size(); i++) {
            Member mem = list.get(i);
            System.out.printf("%d번 회원(이름: %s, ID: %s, PW: %s, Mobile: %s)%n", i+1, mem.getName(), mem.getId(), mem.getPw(), mem.getMobile());
        }
    }

    private void modifyMember() {
        System.out.println("수정할 회원을 검색하세요");
        System.out.print("회원ID: ");
        String input = scan.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(input)) {
                boolean isModify =false;
                while (!isModify) {
                    int menu = -1;
                    System.out.println("\n수정 메뉴를 선택하세요");
                    System.out.println("1. 비밀번호");
                    System.out.println("2. Mobile");
                    System.out.println("0. 수정취소");
                    try {
                        menu = scan.nextInt();
                    } catch (Exception e) {
                        System.out.println("메뉴번호를 눌러주세요");
                        continue;
                    }
                    switch (menu) {
                        case 1:
                            System.out.print("수정할 비밀번호 입력: ");
                            String pw = scan.next();
                            list.get(i).setPw(pw);
                            isModify = true;
                            break;
                        case 2:
                            System.out.println("수정할 폰번호 입력: ");
                            String mobile = scan.next();
                            list.get(i).setMobile(mobile);
                            isModify = true;
                            break;
                        case 0:
                            isModify = true;
                            System.out.println("수정을 취소합니다.");
                            break;
                    }
                }

            }
        }

    }
}




class Member {
    private String id;
    private String pw;
    private String name;
    private String mobile;

    public Member(String id, String pw, String name, String mobile) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return String.format("회원(이름: %s, ID: %s%n)", getName(), getId());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}