package pkg02method;

public class Ex13Contructor {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"ISH","20230101", "01023127053", "19990818");
        Employee[] employees = new Employee[3];
        employees[0] = employee;

        employees[1] = new Employee();
        employees[1].setEno(1234);
        employees[1].setName("KJG");
    }
}

class Employee {
    public Employee() {

    }
    public Employee(int eno, String name, String hireDate, String mobile, String birth) {
        this.eno = eno;
        this.name = name;
        this.hireDate = hireDate;
        this.mobile = mobile;
        this.birth = birth;
    }

    private int eno;
    private String name;
    private String hireDate;
    private String mobile;
    private String birth;
    private String fireDate;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getFireDate() {
        return fireDate;
    }

    public void setFireDate(String fireDate) {
        this.fireDate = fireDate;
    }
}