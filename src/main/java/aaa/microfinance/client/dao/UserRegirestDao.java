package aaa.microfinance.client.dao;

import aaa.microfinance.client.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRegirestDao {
    Integer userregirest(UserBean userBean);
    UserBean userlogin(String username,String password);
}
