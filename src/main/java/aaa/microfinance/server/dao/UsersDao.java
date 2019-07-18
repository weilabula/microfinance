package aaa.microfinance.server.dao;

import aaa.microfinance.server.entiry.Module;
import aaa.microfinance.server.entiry.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 员工管理dao接口
 * @Param:
 * @return:
 */
@Mapper
@Repository
public interface UsersDao {

    /**
     * @Description: 根据用户名和密码查询用户对象
     * @Param: [users]
     * @return: cn.entity.Users
     */
    public Users checkUsernameAndPassword(Users users);

    /**
    * @Description: 查询用户能操作的一级菜单
    * @Param: [users]
    * @return: java.util.List<aaa.microfinance.server.entiry.Module>
    */
    public List<Module> listOneModules(Users users);

    /**
     * @Description: 查询用户能操作的二级菜单
     * @Param: [users]
     * @return: java.util.List<aaa.microfinance.server.entiry.Module>
     */
    public List<Module> listTwoModules(Users users,Module parent);
}
