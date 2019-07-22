package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.dao.RerecordsDao;
import aaa.microfinance.server.entity.Loanorders;
import aaa.microfinance.server.entity.Rerecords;
import aaa.microfinance.server.service.RerecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @Description: 还款管理service实现
 * @Date: 2019/7/19 15:17
*/
@Service
@Transactional
public class RerecordsSerciveImpl implements RerecordsService {

    @Autowired
    private RerecordsDao rerecordsDao;

    /**
     * @Description: 查询所有还款记录
     * @Param: []
     * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
     */
    @Override
    public List<Rerecords> listRerecords() {
        return rerecordsDao.listRerecords();
    }

    /**
     * @Description: 根据还款记录id查询还款记录信息
     * @Param: [id]
     * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
     */
    @Override
    public List<Rerecords> findByRerecordsId(Long id) {
        return rerecordsDao.findByRerecordsId(id);
    }

    /**
     * @Description: 新增还款记录
     * @Param: [rerecords]
     * @return: int
     */
    @Override
    public int save(Rerecords rerecords) {
        return rerecordsDao.save(rerecords);
    }

    /**
     * @Description: 更新还款记录
     * @Param: [rerecords]
     * @return: int
     */
    @Override
    public int update(Rerecords rerecords) {
        return rerecordsDao.update(rerecords);
    }

    /**
     * @Description: 根据还款记录表ID删除还款记录
     * @Param: [id]
     * @return: int
     */
    @Override
    public int deleteRerecords(Long id) {
        return rerecordsDao.deleteRerecords(id);
    }

    /**
    * @Description: 模糊查询还款记录
    * @Param: [rerecords]
    * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
    */
    @Override
    public List<Rerecords> findRerecords(Rerecords rerecords) {
        List<Rerecords> rerecordsList = rerecordsDao.findRerecords(rerecords.getCusid(),rerecords.getCusname());
        return rerecordsList;
    }

    /**
     * @Description: 根据订单编号查询贷款详情
     * @Param: [cusid]
     * @return: java.util.List<aaa.microfinance.server.entiry.Loanorders>
     */
    public List<Loanorders> loanDetail(String ordernumber){
        List<Loanorders> loanorder = rerecordsDao.loanDetail(ordernumber);
        return loanorder;
    }
}
