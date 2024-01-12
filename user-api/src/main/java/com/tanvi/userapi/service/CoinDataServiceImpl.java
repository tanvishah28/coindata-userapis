package com.tanvi.userapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanvi.userapi.dao.ICoinDataDao;
import com.tanvi.userapi.entity.User;

@Service
public class CoinDataServiceImpl implements ICoinDataService {

	@Autowired
	private ICoinDataDao coinDataDao;

	@Override
	public void saveCoinData(String coinSymbol, User user) {
		// TODO Auto-generated method stub

	}

}
