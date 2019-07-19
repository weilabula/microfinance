package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.dao.RerecordsDao;
import aaa.microfinance.server.entiry.Rerecords;
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

}
