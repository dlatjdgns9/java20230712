package pkg13Database.vo;

import java.time.LocalDate;

public class Members {
    private long mno;
    private String id, pw, name, mobile, email;
    private LocalDate regDate, birthDate;

    public Members(long mno, String id, String name, String mobile, String email, LocalDate regDate, LocalDate birthDate) {
        this.mno = mno;
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.regDate = regDate;
        this.birthDate = birthDate;
    }
}
