package aaa.microfinance.client.jumppage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/client")
public class IndexSyn {
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
        session.removeAttribute ("userinfo");
        System.out.println ("用户退出");
        return "/client/index";
    }

    @RequestMapping("/top")
    public String top(){
        System.out.println ("前台头部");
        return "/client/top";
    }
}
