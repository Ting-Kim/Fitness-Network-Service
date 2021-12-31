package timmy.common.fns.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public String login(MemberDto memberDto) {
        System.out.println("memberDto = " + memberDto);
        memberService.signUp(memberDto);
        return "index";
    }
}

