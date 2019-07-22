package aaa.microfinance.server.dao;

import aaa.microfinance.server.entity.Loanorders;
import aaa.microfinance.server.entity.Rerecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
/**
 * @Description: 还款管理dao接口
 * @Date: 2019/7/19 15:17
*/
@Mapper
@Repository
public interface RerecordsDao {

    /**
     * @Description: 查询所有还款记录
     * @Param: []
     * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
     */
    public List<Rerecords> listRerecords();

    /**
     * @Description: 根据还款记录id查询还款记录信息
     * @Param: [id]
     * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
     */
    public List<Rerecords> findByRerecordsId(Long id);

    /**
     * @Description: 新增还款记录
     * @Param: [rerecords]
     * @return: int
     */
    public int save(Rerecords rerecords);

    /**
     * @Description: 更新还款记录
     * @Param: [rerecords]
     * @return: int
     */
    public int update(Rerecords rerecords);

    /**
     * @Description: 根据还款记录表ID删除还款记录
     * @Param: [id]
     * @return: int
     */
    public int deleteRerecords(Long id);

    /**
     * @Description: 根据条件模糊查询还款记录
     * @Param: [rerecords]
     * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
     */
    public List<Rerecords> findRerecords(@Param("cusid") Long cusid, @Param("cusname") String cusname);

    /**
     * @Description: 根据订单编号查询贷款详情
     * @Param: [cusid]
     * @return: java.util.List<aaa.microfinance.server.entiry.Loanorders>
     */
    public List<Loanorders> loanDetail(String ordernumber);
}
