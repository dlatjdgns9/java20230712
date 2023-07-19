package pkg04class;

public class Exercise2 {
    public static void main(String[] args) {
        MemberVO memberVO = new MemberVO("ab123", "1234", "임성훈", 25);
        System.out.println("아이디 : " + memberVO.mem_id);
        System.out.println("패스워드 : " + memberVO.mem_pw);
        System.out.println("이름 : " + memberVO.mem_name);
        System.out.println("나이 : " + memberVO.mem_age);

        System.out.println();
        System.out.println("아이디 : " + memberVO.getMem_id());
        System.out.println("패스워드 : " + memberVO.getMem_pw());
        System.out.println("이름 : " + memberVO.getMem_name());
        System.out.println("나이 : " + memberVO.getMem_age());

        System.out.println();
        memberVO.setMem_name("김준기");
        System.out.println("아이디 : " + memberVO.getMem_id());
        System.out.println("패스워드 : " + memberVO.getMem_pw());
        System.out.println("이름 : " + memberVO.getMem_name());
        System.out.println("나이 : " + memberVO.getMem_age());

        System.out.println();
        MemberVO memberV1 = new MemberVO("kjg", "000", "홍길동", 40);
        System.out.println("아이디 : " + memberV1.mem_id);
        System.out.println("패스워드 : " + memberV1.mem_pw);
        System.out.println("이름 : " + memberV1.mem_name);
        System.out.println("나이 : " + memberV1.mem_age);

        System.out.println();
        System.out.println("아이디 : " + memberV1.getMem_id());
        System.out.println("패스워드 : " + memberV1.getMem_pw());
        System.out.println("이름 : " + memberV1.getMem_name());
        System.out.println("나이 : " + memberV1.getMem_age());
    }
}

class MemberVO {
    String mem_id;
    String mem_pw;
    String mem_name;
    int mem_age;

    public MemberVO(String mem_id, String mem_pw, String mem_name, int mem_age) {
        this.mem_id = mem_id;
        this.mem_pw = mem_pw;
        this.mem_name = mem_name;
        this.mem_age = mem_age;
    }

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_pw() {
        return mem_pw;
    }

    public void setMem_pw(String mem_pw) {
        this.mem_pw = mem_pw;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public int getMem_age() {
        return mem_age;
    }

    public void setMem_age(int mem_age) {
        this.mem_age = mem_age;
    }
}