package aaa.microfinance.client.jumppage;

import aaa.microfinance.server.common.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/client")
public class IndexSyn {
    @RequestMapping("/top")
    public String toppage(){
        return "/client/top";
    }
    @RequestMapping("/foot")
    public String foot(){
        return "/client/foot";
    }
    @RequestMapping("/index")
    public String index(){
        return "/client/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "/client/login";
    }
    @RequestMapping("/register")
    public String register(){
        return "/client/register";
    }
    @RequestMapping("/dropout")
    public String dropout(HttpSession session){
        session.removeAttribute (Constants.SESSION_CLIENT_LOGIN);
        return "/client/index";
    }
    @RequestMapping("/applyforexpected")
    public String applyforexpected(){
        return "/client/applyforexpected";
    }
    @RequestMapping("/applyforloan")
    public String applyforloan(){
        return "/client/applyforloan";
    }
    @RequestMapping("/onlinepayment")
    public String onlinepayment(){
        return "/client/onlinepayment";
    }
    @RequestMapping("/message")
    public String message(){
        return "/client/message";
    }
    @RequestMapping("/userinfo")
    public String userinfo(){
        return "/client/userinfo";
    }
    @RequestMapping("/feedback")
    public String feedback(){
        return "/client/feedback";
    }
    @RequestMapping("/aboutus")
    public String aboutus(){
        return "/client/aboutus";
    }
}
