package timmy.common.fns.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import timmy.common.fns.member.MemberDto;

@Controller
public class CommonController {

    @GetMapping("/signup")
    public String signUpView(Model model) {
        model.addAttribute("memberDto", new MemberDto());

        return "signup";
    }
}

