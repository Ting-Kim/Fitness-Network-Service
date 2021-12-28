package timmy.common.fns.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String loginView() {
        return "index1.html";
    }
}

