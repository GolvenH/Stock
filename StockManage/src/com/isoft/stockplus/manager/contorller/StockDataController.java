package com.isoft.stockplus.manager.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.isoft.stockplus.manager.service.StockDataService;


/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月19日 上午9:40:25
 */
@Controller
public class StockDataController {
    @Autowired
	private StockDataService  sdsvc;
	
    
    
}
