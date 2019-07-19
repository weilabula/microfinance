package aaa.microfinance.server.controller;

import aaa.microfinance.server.common.Constants;
import aaa.microfinance.server.entiry.Login;
import aaa.microfinance.server.entiry.Module;
import aaa.microfinance.server.service.LoginService;
import aaa.microfinance.server.common.DefaultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description: 用户登录控制器
 * @Date: 2019/7/16 11:06
 */
@RestController
@RequestMapping("server")
public class LoginController {

    @Autowired
    private LoginService loginService;


    /**
    * @Description: 验证登录账户信息
    * @Param: [login, session]
    * @return: aaa.microfinance.server.common.DefaultMsg
    */
    @RequestMapping("/checkSysLogin")
    public DefaultMsg checkLogin(@RequestBody Login login, HttpSession session){
        Login log = loginService.checkUsernameAndPassword(login);
        DefaultMsg dm=new DefaultMsg();
        //认证失败
        if(log==null){
            dm.setSuccess(0);
            dm.setError("账户名或者密码错误！请重新输入..");
        }
        else{
            session.setAttribute(Constants.SESSION_EMP,log);
        }
        return dm;
    }

    /**
    * @Description: 获取当前登录用户能操作的菜单
     * @Param: [session]
    * @return: java.util.List<aaa.microfinance.server.entiry.Module>
    */
    @RequestMapping("/getSysMenus")
    public List<Module> getSysMenus(HttpSession session){
        Login login = (Login) session.getAttribute(Constants.SESSION_EMP);
        List<Module> modules = loginService.queryUserMenus(login);
        return modules;
    }
}
