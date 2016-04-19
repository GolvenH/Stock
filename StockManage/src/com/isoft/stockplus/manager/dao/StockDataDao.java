package com.isoft.stockplus.manager.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.isoft.stockplus.manager.po.StockData;
@Repository
public class StockDataDao extends Hibernate4BaseDao<StockData> {
	
	public List<StockData> findbyStockinfoId(Integer id){
		
		
		Session session= openSession();
		
		List<StockData> list= session.createQuery("from StockData where stockinfoId=?").setInteger(0,id).list();
		
		session.close();
		
		return list;
		
	}

}
