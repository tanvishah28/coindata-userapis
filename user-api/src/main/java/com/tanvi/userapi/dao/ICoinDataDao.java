package com.tanvi.userapi.dao;

import java.util.List;

import com.tanvi.userapi.entity.CoinData;

public interface ICoinDataDao {

	void saveCoinData(CoinData coinData);

    List<CoinData> getCoinDataByUserId(Long userId);
}
