package timmy.common.fns.member;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    private String email;
    private String password;

    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Member of(MemberDto memberDto) {
        return new Member(
                memberDto.getEmail(),
                new BCryptPasswordEncoder().encode(memberDto.getPassword()));
    }
}
