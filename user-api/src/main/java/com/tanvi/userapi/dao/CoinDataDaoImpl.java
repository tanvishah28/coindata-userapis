package com.tanvi.userapi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanvi.userapi.entity.CoinData;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class CoinDataDaoImpl implements ICoinDataDao{

private SessionFactory sessionFactory;
	
	@Autowired
	private CoinDataDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void saveCoinData(CoinData coinData) {
		Session session = sessionFactory.getCurrentSession();
        session.persist(coinData);	
	}

	@Override
	public List<CoinData> getCoinDataByUserId(Long userId) {
		// getting session from session factory
		Session session = sessionFactory.getCurrentSession();
		
		// building criteria query using builder
        CriteriaBuilder builder = session.getCriteriaBuilder();
        
        CriteriaQuery<CoinData> query = builder.createQuery(CoinData.class);
        
        Root<CoinData> root = query.from(CoinData.class);
        
        query.select(root).where(builder.equal(root.get("user").get("id"), userId));
        
        // returning list of coin data from the session
        return session.createQuery(query).getResultList();
	}

}
