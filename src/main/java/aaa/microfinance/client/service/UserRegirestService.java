package aaa.microfinance.client.service;

import aaa.microfinance.client.entity.UserBean;
import aaa.microfinance.client.utils.ReturnModel;

public interface UserRegirestService {
    Integer userregirest(UserBean userBean);
    ReturnModel userlogin(String username, String password);
}
