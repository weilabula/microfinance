package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.dao.UsersDao;
import aaa.microfinance.server.entiry.Module;
import aaa.microfinance.server.entiry.Users;
import aaa.microfinance.server.service.UsersService;
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
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    /**
     * @Description: 验证登录账户信息
     * @Param: [users]
     * @return: cn.entity.Users
     */
    @Override
    public Users checkUsernameAndPassword(Users users) {
        return usersDao.checkUsernameAndPassword(users);
    }

    /**
     * @Description: 查询当前登录用户能操作的菜单
     * @Param: [users]
     * @return: java.util.List<aaa.microfinance.server.entiry.Module>
     */
    @Override
    public List<Module> queryUserMenus(Users users) {
        List<Module> listModules=usersDao.listOneModules(users);
        for(Module oneModule:listModules){
            List<Module> twoModules=usersDao.listTwoModules(users,oneModule);
            oneModule.setChildren(twoModules);
        }
        return listModules;
    }
}
