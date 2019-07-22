package aaa.microfinance.server.dao;

import aaa.microfinance.server.entity.Login;
import aaa.microfinance.server.entity.Module;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 员工管理dao接口
 * @Param:
 * @return:
 */
@Mapper
@Repository
public interface LoginDao {

    /** 
    * @Description: 根据用户名和密码查询用户对象
     * @Param: [login]
    * @return: aaa.microfinance.server.entiry.Login 
    */ 
    public Login checkUsernameAndPassword(Login login);

    /** 
    * @Description: 查询用户能操作的一级菜单 
    * @Param: [login]
    * @return: java.util.List<aaa.microfinance.server.entiry.Module> 
    */ 
    public List<Module> listOneModules(Login login);

    /** 
    * @Description: 查询用户能操作的二级菜单 
    * @Param: [login, parent]
    * @return: java.util.List<aaa.microfinance.server.entiry.Module> 
    */ 
    public List<Module> listTwoModules(@Param("login") Login login, @Param("parent") Module parent);
}
