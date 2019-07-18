package aaa.microfinance.server.controller;

import aaa.microfinance.server.common.Constants;
import aaa.microfinance.server.entiry.Module;
import aaa.microfinance.server.entiry.Users;
import aaa.microfinance.server.service.UsersService;
import aaa.microfinance.server.common.DefaultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    private UsersService usersService;


    /**
     * @Description:  验证登录账户信息
     * @Param: [users]
     * @return: cn.common.DefaultMsg
     */
    @RequestMapping("/checkSysLogin")
    public DefaultMsg checkLogin(@RequestBody Users users, HttpSession session){
        Users u = usersService.checkUsernameAndPassword(users);
        DefaultMsg dm=new DefaultMsg();
        //认证失败
        if(u==null){
            dm.setSuccess(0);
            dm.setErroe("账户名或者密码错误！请重新输入..");
        }
        else{
            session.setAttribute(Constants.SESSION_USER,u);
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
        Users user = (Users)session.getAttribute(Constants.SESSION_USER);
        List<Module> modules = usersService.queryUserMenus(user);
        return modules;
    }
}
