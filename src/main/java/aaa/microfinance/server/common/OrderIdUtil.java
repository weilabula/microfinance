package aaa.microfinance.server.common;

import java.util.Random;

/**
 * 生成订单号
 */

public class OrderIdUtil {
	/**
	 * 订单号生成规则
	 * 前13位订单的下单时间
	 * 最后4位为1000到9999的随机数
	 * 中间的3位为门店的id
	 * @param storeID
	 * @return
	 */
	public static String CreateOrderId(int storeID) {
		Random random = new Random();
		int nextInt = random.nextInt(8999);
		int num = nextInt + 1000;
		StringBuilder orderId = new StringBuilder();   
		long time = System.currentTimeMillis();
		orderId.append(time);
		String str =IOrderPriceConst.HEAD_STR + String.valueOf(storeID);
		String store = str.substring(str.length()-3, str.length());
		orderId.append(store);
		if(num < IOrderPriceConst.BEGIN_RANDOM || num > IOrderPriceConst.END_RANDOM) {
			num = IOrderPriceConst.BEGIN_RANDOM;
		}
		orderId.append(String.valueOf(num));
		return orderId.toString();
	}
	
	/**
	 * 
	 * @param weight   物品重量
 	 * @param volume   物品体积
	 * @param i        判断省内外件
	 * @return
	 */
	public static double reckon(double weight,double volume ,int i) {
		double price = 0.0;
		double overweight;
		double maxheavy;
		double bulkfactor;
		if( i == IOrderPriceConst.INNER_PROVINCE) {
			bulkfactor = volume*IOrderPriceConst.INNER_VOLUME_FORMULA;
			price = IOrderPriceConst.INNER_BASE_PRICE;
		}else {						
			bulkfactor = volume*IOrderPriceConst.FOREIGN_VOLUME_FORMULA;
			price = IOrderPriceConst.FOREIGN_BASE_PRICE;
		}
		if(weight > bulkfactor) {
			maxheavy = weight;
		}else {
			maxheavy = bulkfactor;
		}
		if(i == IOrderPriceConst.INNER_PROVINCE) {
			if(maxheavy > IOrderPriceConst.BASE_WEIGHT) {				
				overweight = Math.ceil((weight-IOrderPriceConst.BASE_WEIGHT)/0.5) ;
				price += overweight * IOrderPriceConst.INNER_CONTINUED_HEAVY_PRICE;
			}
		}else {
			if(maxheavy > IOrderPriceConst.BASE_WEIGHT) {				
				overweight = Math.ceil((weight-IOrderPriceConst.BASE_WEIGHT)/0.5);
				price += overweight * IOrderPriceConst.FOREIGN_CONTINUED_HEAVY_PRICE;
			}
		}
		return Math.floor(price);
		
	}
}
