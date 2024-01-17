package 과제.과제6;

public class Member {
    /*[ Member 클래스 ]
            0. 아래 필드를 가지는 클래스를 설계 하시오.
    필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
            2. getter , setter 메소드를 사용하시오.*/

    private String id;
    private String pw;
    private String name;
    private String phone;
    private String age;

    public Member(){}

    public Member(String id, String pw, String name, String phone, String age) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
