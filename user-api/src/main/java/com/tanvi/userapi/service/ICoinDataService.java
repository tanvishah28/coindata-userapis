package com.tanvi.userapi.service;

import com.tanvi.userapi.entity.User;

public interface ICoinDataService {

	public void saveCoinData(String coinSymbol, User user);
}
