package pkg13Database.vo;

import java.time.LocalDate;

public class Members {
    private long mno;
    private String id, pass, sname, mobile, email;
    private LocalDate regdate, birthdate;

    public Members(long mno, String id, String sname, String mobile
            , String email, LocalDate regdate, LocalDate birthdate) {
        this.mno = mno;
        this.id = id;
        this.sname = sname;
        this.mobile = mobile;
        this.email = email;
        this.regdate = regdate;
        this.birthdate = birthdate;
    }

    public Members(String id, String pass, String sname, String mobile
            , String email, LocalDate birthdate) {
        this.id = id;
        this.pass = pass;
        this.sname = sname;
        this.mobile = mobile;
        this.email = email;
        this.birthdate = birthdate;
    }

    public Long getMno() {return mno;}
    public String getId() {return id;}
    public String getPass(){return pass;}
    public String getSname() {return sname;}
    public String getMobile() {return mobile;}
    public String getEmail() {return email;}
    public LocalDate getRegdate() {return regdate;}
    public LocalDate getBirthdate() {return birthdate;}
}