package aaa.microfinance.server.common;

public interface IOrderPriceConst {
	
	/**
	 * 字符串000
	 */
	String HEAD_STR = "000";
	
	/**
	 * 开始随机数
	 */
	int BEGIN_RANDOM = 1000;
	/**
	 * 结束随机数
	 */
	int END_RANDOM = 9999;
	
	

	/**
	 * 省内基础价格
	 */
	double INNER_BASE_PRICE = 12.0;
	/**
	 * 外省基础价格
	 */
	double FOREIGN_BASE_PRICE = 22.0;
	/**
	 * 省内续重
	 */
	double	INNER_CONTINUED_HEAVY_PRICE = 2.0;
	
	/**
	 * 外省续重
	 */
	double FOREIGN_CONTINUED_HEAVY_PRICE = 8.0;
	/**
	 * 省内体积重量公式
	 */
	double INNER_VOLUME_FORMULA = 1000000/12000.0; 
	/**
	 * 外省体积重量公式
	 */
	double FOREIGN_VOLUME_FORMULA = 1000000/6000.0;
	/**
	 * 基础物品重量
	 */
	double BASE_WEIGHT = 1.0 ;
		
	/**
	 * 内省件
	 */
	int INNER_PROVINCE = 0;
	
	/**
	 * 外省件
	 */
	int FOREIGN_PROVINCE = 1;
	
	/**
	 * 未提交
	 */
	int NO_COMMIT_CODE = 0;
	
	/**
	 * 待审核
	 */
	int TO_AUDIT_CODE = 1;
	
	/**
	 * 揽件中
	 */
	int COMMIT_SUCCESS_CODE = 2;
	
	/**
	 * 运送中
	 */
	int TRANSPROT_CODE = 3;
	
	/**
	 * 已接收
	 */
	int RECEIVE_CODE = 4 ;
	/**
	 * 驳回
	 */
	int CHECK_FAILED_CODE = 5;
	
	
	//订单操作常量
	/**
	 * 添加订单
	 */
	String ADD_ORDER = "添加订单";
	
	/**
	 * 修改订单
	 */
	String UPDATE_ORDER = "修改订单";
	
	/**
	 * 删除订单
	 */
	String DELETE_ORDER = "删除订单";
	
	/**
	 * 提交订单
	 */
	String TO_SUBMIT = "提交订单";
	
	/**
	 * 审核通过
	 */
	String CHECK_SUCCESS = "审核通过";
	
	/**
	 * 驳回
	 */
	String CHECK_FAILED = "驳回";
	
	/**
	 * 入库
	 */
	String INPUT = "入库";
	
	/**
	 * 分拨
	 */
	String ALLOCATE = "分拨";
	
	/**
	 * 分配车辆
	 */
	String ALLOCATE_CAR = "分配车辆";
	
	/**
	 * 出库
	 */
	String OUTPUT = "订单出库";
	
	
	/**
	 * 分配派件员
	 */
	String SEND = "分配派件员";
	
	/**
	 * 确认收货
	 */
	String RECEIVE = "确认收货";
	
	/**
	 * 已分拨，待分配车辆
	 */
	int AFTER_ALLOCATE = 1;
	
	/**
	 * 已分配车辆，待出库
	 */
	int AFTER_ALLOCATE_CAR = 2;
	
	/**
	 * 已出库
	 */
	int AFTER_OUTPUT = 3;
	
}
