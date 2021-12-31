package timmy.common.fns.member;

import lombok.Data;

@Data
public class MemberDto {

    private String email;
    private String password;

    public MemberDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public MemberDto() {
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

