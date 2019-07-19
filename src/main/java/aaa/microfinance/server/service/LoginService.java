package aaa.microfinance.server.service;

import aaa.microfinance.server.entiry.Login;
import aaa.microfinance.server.entiry.Module;

import java.util.List;

/**
 * @Description: 员工管理service接口
 * @Param:
 * @return:
 */
public interface LoginService {
    /**
     * @Description: 根据用户名和密码查询用户对象
     * @Param: [users]
     * @return: cn.entity.Users
     */
    public Login checkUsernameAndPassword(Login login);

    /**
    * @Description: 查询当前登录用户能操作的菜单
    * @Param: [users]
    * @return: java.util.List<aaa.microfinance.server.entiry.Module>
    */
    public List<Module> queryUserMenus(Login login);
}
