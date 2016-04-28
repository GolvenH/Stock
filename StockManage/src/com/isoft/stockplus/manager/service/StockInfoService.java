package com.isoft.stockplus.manager.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.StockDataDao;
import com.isoft.stockplus.manager.dao.StockInfoDao;
import com.isoft.stockplus.manager.dao.StockUserDao;
import com.isoft.stockplus.manager.po.Stockdata;
import com.isoft.stockplus.manager.po.Stockinfo;

@Service
public class StockInfoService {
	@Autowired
	private StockInfoDao sidao;
	
	@Autowired
	private StockDataDao sddao;
	public List<Stockinfo>  getall(){
		return sidao.findAll();
	}
	
	public Map<String,Object> getStockinfobyid(String id){
		Stockinfo si=  	sidao.findById(Integer.valueOf(id));
		 List<Stockdata> sdlist=sddao.findbyStockinfoId(Integer.valueOf(id));
		 Map<String, Object> map=new HashMap<String, Object>();
		 map.put("Stock", si);
		 map.put("StockData", sdlist);
		 return map;
	}
    public Map<String,Object> findbypage(Integer first,Integer max){
		
		return sidao.findByPage(first, max);
		
	}

	public void deleteStockinfobyid(Integer id)
	{
		// TODO Auto-generated method stub
		sidao.deleteById(id);
	}
}
