package com.isoft.stockplus.manager.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.isoft.stockplus.manager.po.Stockdata;
@Repository
public class StockDataDao extends Hibernate4BaseDao<Stockdata> {
	
	public List<Stockdata> findbyStockinfoId(Integer id){
		
		
		Session session= openSession();
		
		List<Stockdata> list= session.createQuery("from StockData where stockinfoId=?").setInteger(0,id).list();
		session.close();
		return list;
	}

}
