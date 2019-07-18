package aaa.microfinance.server.jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 页面跳转类
 * @Date: 2019/7/18 10:30
*/
@Controller
@RequestMapping("server")
public class Jump {
    /**
     * @Description: 跳转到登录界面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/sysLogin")
    public String login(){
        return "background/sysLogin";
    }

    @RequestMapping("/sysIndex")
    public String sysIndex(){
        return "background/sysIndex";
    }
}
