package aaa.microfinance.server.jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 页面跳转类
 * @Date: 2019/7/18 10:30
*/
@Controller
@RequestMapping("server")
public class Jump {
    /**
     * @Description: 跳转到登录界面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/sysLogin")
    public String login(){
        return "background/sysLogin";
    }

    /**
    * @Description: 跳转到系统首页
    * @Param: []
    * @return: java.lang.String
    */
    @RequestMapping("/sysIndex")
    public String sysIndex(){
        return "background/sysIndex";
    }

    /**
    * @Description:  跳转到欢迎页
    * @Param: []
    * @return: java.lang.String
    */
    @RequestMapping("/welcome")
    public String welcome(){
        return "background/sysWelcome";
    }


    /************************************系统管理******************************************/
    /**
    * @Description: 跳转到部门管理页面
    * @Param: []
    * @return: java.lang.String
    */
    @RequestMapping("/dept/deptManager")
    public String deptManager(){
        return "background/sysDeptManager";
    }

    /**
     * @Description: 跳转到员工管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/emp/empManager")
    public String empManager(){
        return "background/sysEmpManager";
    }

    /**
     * @Description: 跳转到客户管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/custom/customManager")
    public String customManager(){
        return "background/sysCustomManager";
    }

    /**
     * @Description: 跳转到角色管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/role/roleManager")
    public String roleManager(){
        return "background/sysRoleManager";
    }

    /**
     * @Description: 跳转到权限管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/module/moduleManager")
    public String moduleManager(){
        return "background/sysModuleManager";
    }


    /************************************审核管理******************************************/
    /**
     * @Description: 跳转到贷款审核页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/loan/loanAudit")
    public String loanAudit(){
        return "background/sysLoanAudit";
    }

    /**
     * @Description: 跳转到放款审核页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/lend/lendAudit")
    public String lendAudit(){
        return "background/sysLendAudit";
    }

    /**
     * @Description: 跳转到还款审核页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/re/reAudit")
    public String reAudit(){
        return "background/sysReAudit";
    }

    /**
     * @Description: 跳转到逾期审核页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/wit/witAudit")
    public String witAudit(){
        return "background/sysWitAudit";
    }

    /************************************放款管理******************************************/
    /**
     * @Description: 跳转到利率管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/rate/rateManager")
    public String rateManager(){
        return "background/sysRateManager";
    }

    /**
     * @Description: 跳转到放款明细页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/lend/lendDetail")
    public String lendDetail(){
        return "background/sysLendDetail";
    }

    /************************************还款管理******************************************/

    /**
     * @Description: 跳转到还款记录页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/re/reRecords")
    public String reRecords(){
        return "background/sysReRecords.html";
    }

    /**
     * @Description: 跳转到分期管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/ins/insManager")
    public String insManager(){
        return "background/sysInsManager.html";
    }

    /**
     * @Description: 跳转到逾期管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/wit/witManager")
    public String witManager(){
        return "background/sysWitManager";
    }

    /**
     * @Description: 跳转到还款确认页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/re/reConfirm")
    public String reConfirm(){
        return "background/sysReConfirm";
    }

    /************************************财务管理******************************************/

    /**
     * @Description: 跳转到账户管理页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/acc/accManager")
    public String accManager(){
        return "background/sysAccManager";
    }

    /**
     * @Description: 跳转到支出明细页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/spe/speDetail")
    public String speDetail(){
        return "background/sysSpeDetail";
    }

    /**
     * @Description: 跳转到收入明细页面
     * @Param: []
     * @return: java.lang.String
     */
    @RequestMapping("/inc/incDetail")
    public String incDetail(){
        return "background/sysIncDetail";
    }

    /**
    * @Description: 跳转到统计页面
    * @Param: []
    * @return: java.lang.String
    */
    @RequestMapping("statis/statis")
    public String statis(){
        return "background/sysStatis";
    }


}
