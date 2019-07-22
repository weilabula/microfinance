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
        System.out.println ("头部页面");
        return "/client/top";
    }
    @RequestMapping("/foot")
    public String foot(){
        System.out.println ("尾部页面");
        return "/client/foot";
    }
    @RequestMapping("/index")
    public String index(){
        System.out.println ("前台主页");
        return "/client/index";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println ("登录页面");
        return "/client/login";
    }
    @RequestMapping("/register")
    public String register(){
        System.out.println ("注册页面");
        return "/client/register";
    }
    @RequestMapping("/dropout")
    public String dropout(HttpSession session){
        session.removeAttribute (Constants.SESSION_CLIENT_LOGIN);
        System.out.println ("用户退出");
        return "/client/index";
    }
    @RequestMapping("/feedback")
    public String feedback(){
        System.out.println ("用户反馈页面");
        return "/client/feedback";
    }
    @RequestMapping("/aboutus")
    public String aboutus(){
        System.out.println ("用户反馈页面");
        return "/client/aboutus";
    }
    @RequestMapping("/applyforexpected")
    public String applyforexpected(){
        System.out.println ("申请预期页面");
        return "/client/applyforexpected";
    }
    @RequestMapping("/applyforloan")
    public String applyforloan(){
        System.out.println ("申请贷款页面");
        return "/client/applyforloan";
    }
    @RequestMapping("/onlinepayment")
    public String onlinepayment(){
        System.out.println ("在线还款页面");
        return "/client/onlinepayment";
    }
    @RequestMapping("/message")
    public String message(){
        System.out.println ("消息通知页面");
        return "/client/message";
    }
    @RequestMapping("/userinfo")
    public String userinfo(){
        System.out.println ("个人信息页面");
        return "/client/userinfo";
    }
}
