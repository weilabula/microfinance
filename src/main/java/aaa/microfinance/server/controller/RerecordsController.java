package aaa.microfinance.server.controller;

import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.entiry.Loanorders;
import aaa.microfinance.server.entiry.Rerecords;
import aaa.microfinance.server.service.RerecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 还款管理控制器
 * @Date: 2019/7/19 15:06
*/
@RestController
@RequestMapping("server")
public class RerecordsController {

    @Autowired
    private RerecordsService rerecordsService;

    @RequestMapping("/re/listRerecords")
    public List<Rerecords> listRerecords(){
        List<Rerecords> rerecords = rerecordsService.listRerecords();
        return rerecords;
    }

    /**
    * @Description: 添加或者编辑还款记录
    * @Param: [rerecords]
    * @return: aaa.microfinance.server.common.DefaultMsg
    */
    @RequestMapping("/re/saveOrUpdate")
    public DefaultMsg saveOrUpdate(@RequestBody Rerecords rerecords){
        int count =0;
        if(rerecords.getId()==null){
            count = rerecordsService.save(rerecords);
        }
        else {
            count=rerecordsService.update(rerecords);
        }

        DefaultMsg defaultMsg=new DefaultMsg();
        if(count>0){
            defaultMsg.setSuccess(1);
        }
        else {
            defaultMsg.setSuccess(0);
            defaultMsg.setError("操作失败！");
        }
        return defaultMsg;

    }

    /**
    * @Description: 根据还款记录表ID删除还款记录
    * @Param: []
    * @return: aaa.microfinance.server.common.DefaultMsg
    */
    @RequestMapping("/re/deleteRerecords")
    public DefaultMsg deleteRerecords(@RequestBody Rerecords rerecords){
        Long id=rerecords.getId();
        int i = rerecordsService.deleteRerecords(id);
        DefaultMsg dm=new DefaultMsg();
        if(i==0){
            dm.setError("删除失败！");
            dm.setSuccess(0);
        }else{
            dm.setError("删除成功~");
        }

        return dm;
    }

    /**
    * @Description: 根据条件模糊查询还款记录
    * @Param: [rerecords]
    * @return: java.util.List<aaa.microfinance.server.entiry.Rerecords>
    */
    @RequestMapping("/re/findRerecords")
    public List<Rerecords> findRerecords(@RequestBody Rerecords rerecords){
        List<Rerecords> rerecordsList = rerecordsService.findRerecords(rerecords);
        return rerecordsList;
    }

    /** 
    * @Description: 根据订单编号查询贷款详情
    * @Param: [rerecords]
    * @return: java.util.List<aaa.microfinance.server.entiry.Loanorders> 
    */ 
    @RequestMapping("/re/loanDetail")
    public List<Loanorders> loanDetail(@RequestBody Rerecords rerecords){
        String ordernumber = rerecords.getOrdernumber();
        List<Loanorders> loanorders = rerecordsService.loanDetail(ordernumber);
        return loanorders;
    }
}
