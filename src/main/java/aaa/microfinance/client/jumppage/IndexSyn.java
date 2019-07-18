package aaa.microfinance.client.jumppage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexSyn {
    @RequestMapping("/index")
    public String index(){
        System.out.println ("前台主页");
        return "/index";
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println ("登录页面");
        return "/login";
    }
    @RequestMapping("/register")
    public String register(){
        System.out.println ("注册页面");
        return "/register";
    }
    @RequestMapping("/dropout")
    public String dropout(HttpSession session){
        session.removeAttribute ("userinfo");
        System.out.println ("用户退出");
        return "/index";
    }
}
