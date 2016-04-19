package com.isoft.stockplus.manager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.StockDataDao;
@Service
public class StockDataService {
	@Autowired
	private StockDataDao sddao;

}
