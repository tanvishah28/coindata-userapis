package com.tanvi.userapi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coin_data")
public class CoinData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coin_data_id")
	private Long coinDataId;

	// Many coin data's will be fetched for one user
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;

	@Column(name = "coin_symbol")
	private String coinSymbol;

	@Column(name = "request_response")
	private String requestResponse;

	@Column(name = "timestamp")
	private LocalDateTime timestamp;

	public Long getCoinDataId() {
		return coinDataId;
	}

	public void setCoinDataId(Long coinDataId) {
		this.coinDataId = coinDataId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getRequestResponse() {
		return requestResponse;
	}

	public void setRequestResponse(String requestResponse) {
		this.requestResponse = requestResponse;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "CoinData [coinDataId=" + coinDataId + ", userId=" + userId + ", requestResponse=" + requestResponse
				+ ", timestamp=" + timestamp + "]";
	}
}
