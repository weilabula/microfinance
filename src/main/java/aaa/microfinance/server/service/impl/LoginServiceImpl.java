package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.dao.LoginDao;

import aaa.microfinance.server.entity.Login;
import aaa.microfinance.server.entity.Module;
import aaa.microfinance.server.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 员工管理service实现
 * @Param:
 * @return:
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    /**
    * @Description: 验证登录账户信息
    * @Param: [login]
    * @return: aaa.microfinance.server.entiry.Login
    */
    @Override
    public Login checkUsernameAndPassword(Login login) {
        return loginDao.checkUsernameAndPassword(login);
    }

    /**
    * @Description: 查询当前登录用户能操作的菜单
    * @Param: [login]
    * @return: java.util.List<aaa.microfinance.server.entiry.Module>
    */
    @Override
    public List<Module> queryUserMenus(Login login) {
        List<Module> listModules=loginDao.listOneModules(login);
        for(Module oneModule:listModules){
            List<Module> twoModules=loginDao.listTwoModules(login,oneModule);
            oneModule.setChildren(twoModules);
        }
        return listModules;
    }
}
