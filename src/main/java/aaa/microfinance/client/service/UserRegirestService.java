package aaa.microfinance.client.service;

import aaa.microfinance.client.entity.UserBean;
import aaa.microfinance.client.utils.ReturnModel;
public interface UserRegirestService {
    /**
    * @Description: 注册
    * @Param: [userBean]
    * @return: java.lang.Integer
    */
    Integer userregirest(UserBean userBean);
    /**
    * @Description: 登录
    * @Param: [username, password]
    * @return: aaa.microfinance.client.utils.ReturnModel
    */
    ReturnModel userlogin(String username, String password);
}
